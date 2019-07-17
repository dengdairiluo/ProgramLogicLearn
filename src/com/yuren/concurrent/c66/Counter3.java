package com.yuren.concurrent.c66;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-09 00:15
 */
public class Counter3 {

    private int count;
    private Object lock = new Object();

    public void incr() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}
