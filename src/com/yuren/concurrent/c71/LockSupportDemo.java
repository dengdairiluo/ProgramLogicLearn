package com.yuren.concurrent.c71;

import java.util.concurrent.locks.LockSupport;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-14 23:51
 */
public class LockSupportDemo {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            LockSupport.park();
            System.out.println("exit");
        });
        t.start();
        Thread.sleep(1000);
        LockSupport.unpark(t);

    }

}
