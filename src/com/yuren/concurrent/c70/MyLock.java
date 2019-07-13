package com.yuren.concurrent.c70;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-13 23:25
 */
public class MyLock {
    private AtomicInteger status = new AtomicInteger(0);

    public void lock() {
        while (!status.compareAndSet(0, 1)) {
            Thread.yield();
        }
    }

    public void unlock() {
        status.compareAndSet(1, 0);
    }
}
