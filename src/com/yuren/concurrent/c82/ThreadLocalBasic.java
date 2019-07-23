package com.yuren.concurrent.c82;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-23 23:32
 */
public class ThreadLocalBasic {
    static ThreadLocal<Integer> local = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        Thread child = new Thread(() -> {
            System.out.println("child thread initial: " + local.get());
            local.set(200);
            System.out.println("child thread final: " + local.get());
        });
        local.set(100);
        child.start();
        child.join();
        System.out.println("main thread final: " + local.get());
    }
}
