package com.yuren.concurrent.c71;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-14 23:51
 */
public class Counter {
    private final Lock lock = new ReentrantLock();
    private volatile int count;

    public void incr() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

}
