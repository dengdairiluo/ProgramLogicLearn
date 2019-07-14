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
public class Account {

    private Lock lock = new ReentrantLock();
    private volatile double money;

    public Account(double initialMoney) {
        this.money = initialMoney;
    }

    public void add(double money) {
        lock.lock();
        try {
            this.money += money;
        } finally {
            lock.unlock();
        }
    }

    public void reduce(double money) {
        lock.lock();
        try {
            this.money -= money;
        } finally {
            lock.unlock();
        }
    }

    public double getMoney() {
        return money;
    }

    void lock() {
        lock.lock();
    }

    void unlock() {
        lock.unlock();
    }

    boolean tryLock() {
        return lock.tryLock();
    }

}
