package com.yuren.concurrent.c67;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-11 00:57
 */
public class WaitThread extends Thread {
    private volatile boolean fire = false;

    public static void main(String[] args) throws InterruptedException {
        WaitThread waitThread = new WaitThread();
        waitThread.start();
        Thread.sleep(1000);
        System.out.println("fire");
        waitThread.fire();
    }

    @Override
    public void run() {
        try {
            synchronized (this) {
                while (!fire) {
                    wait();
                }
            }
            System.out.println("fired");
        } catch (InterruptedException e) {
        }
    }

    public synchronized void fire() {
        this.fire = true;
        notify();
    }
}
