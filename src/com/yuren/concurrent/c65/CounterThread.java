package com.yuren.concurrent.c65;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-08 01:40
 */
public class CounterThread extends Thread {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread();
            threads[i].start();
        }

        for (int i = 0; i < num; i++) {
            threads[i].join();
        }

        System.out.println(counter);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }
}
