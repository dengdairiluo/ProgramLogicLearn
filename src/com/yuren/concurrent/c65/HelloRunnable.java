package com.yuren.concurrent.c65;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-08 01:40
 */
public class HelloRunnable implements Runnable {

    public static void main(String[] args) {
        Thread helloThread = new Thread(new HelloRunnable());
        helloThread.start();
    }

    @Override
    public void run() {
        System.out.println("hello");
    }
}
