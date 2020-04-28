package com.yuren.java8.c94;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2020-04-28 23:19
 */
public class BasicFutureDemo {

    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(10);

    private static final Random RND = new Random();
    static Callable<Integer> externalTask = () -> delayRandom(20, 2000);

    static int delayRandom(int min, int max) {
        int milli = max > min ? RND.nextInt(max - min) : 0;
        try {
            Thread.sleep(min + milli);

        } catch (InterruptedException e) {

        }
        return milli;
    }

    public static Future<Integer> callExternalService() {
        return EXECUTOR.submit(externalTask);
    }

    public static Future<Integer> callExternalService2() {
        FutureTask<Integer> future = new FutureTask<>(externalTask);
        new Thread(future).start();
        return future;
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
