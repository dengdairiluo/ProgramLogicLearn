package com.yuren.java8.c94;

import java.util.Random;
import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2020-04-28 23:26
 */
public class BasicCompletableFutureDemo {


    private static final ExecutorService EXECUTOR =
            Executors.newFixedThreadPool(10);

    private static final Random RND = new Random();

    static int delayRandom(int min, int max) {
        int milli = max > min ? RND.nextInt(max - min) : 0;
        try {
            Thread.sleep(min + milli);
        } catch (InterruptedException e) {
        }
        return milli;
    }

    static Supplier<Integer> externalTask = () -> delayRandom(20, 2000);

    public static Future<Integer> callExternalService(){
        return CompletableFuture.supplyAsync(externalTask, EXECUTOR);
    }

    public static Future<Integer> callExternalService2() {
        CompletableFuture<Integer> future = new CompletableFuture<>();
        new Thread(() -> {
            try {
                future.complete(externalTask.get());
            } catch (Exception e) {
                future.completeExceptionally(e);
            }
        }).start();
        return future;
    }

    public static void whenCompleteDemo(){
        CompletableFuture.supplyAsync(externalTask).whenComplete((result, ex) -> {
            if (result != null) {
                System.out.println(result);
            }
            if (ex != null) {
                ex.printStackTrace();
            }
        }).join();
    }

    public static void handleDemo(){
        String ret =
                CompletableFuture.supplyAsync(()->{
                    throw new RuntimeException("test");
                }).handle((result, ex)-> "hello").join();
        System.out.println(ret);
    }

    public static void taskStreamThenRun(){
        Runnable taskA = () -> System.out.println("task A");
        Runnable taskB = () -> System.out.println("task B");
        Runnable taskC = () -> System.out.println("task C");

        CompletableFuture.runAsync(taskA)
                .thenRun(taskB)
                .thenRun(taskC)
                .join();
    }

    public static void taskStreamThenApply(){
        Supplier<String> taskA = () -> "hello";
        Function<String, String> taskB = String::toUpperCase;
        Consumer<String> taskC = (t) -> System.out.println("consume: " + t);

        CompletableFuture.supplyAsync(taskA)
                .thenApply(taskB)
                .thenAccept(taskC)
                .join();
    }

    public static void taskStreamThenCompose(){
        Supplier<String> taskA = () -> "hello";
        Function<String, CompletableFuture<String>> taskB = (t) ->
                CompletableFuture.supplyAsync(t::toUpperCase);
        Consumer<String> taskC = (t) -> System.out.println("consume: " + t);

        CompletableFuture.supplyAsync(taskA)
                .thenCompose(taskB)
                .thenAccept(taskC)
                .join();
    }

    public static void taskStreamThenCombine(){
        Supplier<String> taskA = () -> "taskA";
        CompletableFuture<String> taskB = CompletableFuture.supplyAsync(() -> "taskB");
        BiFunction<String, String, String> taskC = (a, b) -> a + "," + b;

        String ret = CompletableFuture.supplyAsync(taskA)
                .thenCombineAsync(taskB, taskC)
                .join();
        System.out.println(ret);
    }

    public static void taskStreamAllOf(){
        CompletableFuture<String> taskA = CompletableFuture.supplyAsync(() -> {
            delayRandom(100, 1000);
            return "helloA";
        }, EXECUTOR);

        CompletableFuture<Void> taskB = CompletableFuture.runAsync(() -> {
            delayRandom(2000, 3000);
        }, EXECUTOR);

        CompletableFuture<Void> taskC = CompletableFuture.runAsync(() -> {
            delayRandom(30, 100);
            throw new RuntimeException("task C exception");
        }, EXECUTOR);

        CompletableFuture.allOf(taskA, taskB, taskC).whenComplete((result, ex) -> {
            if (ex != null) {
                System.out.println(ex.getMessage());
            }
            if (!taskA.isCompletedExceptionally()) {
                System.out.println("task A " + taskA.join());
            }
        });

    }

    public static void master() {
        // 执行异步任务
        Future<Integer> asyncRet = callExternalService();

        // 执行其他任务 ...

        // 获取异步任务的结果，处理可能的异常
        try {
            Integer ret = asyncRet.get();
            System.out.println(ret);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        master();

    }
}
