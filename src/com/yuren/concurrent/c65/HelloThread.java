package com.yuren.concurrent.c65;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-08 01:47
 */
public class HelloThread extends Thread {

    public static void main(String[] args) {
        Thread thread = new HelloThread();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("thread name: " + Thread.currentThread().getName());
        System.out.println("hello");
    }
}
