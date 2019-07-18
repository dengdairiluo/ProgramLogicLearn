package com.yuren.concurrent.c80;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-18 23:21
 */
public class ScheduledFixedDelay {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService timer = Executors.newScheduledThreadPool(10);
        timer.schedule(new LongRunningTask(), 10, TimeUnit.MILLISECONDS);
        timer.scheduleWithFixedDelay(new FixedDelayTask(), 100, 1000,
                TimeUnit.MILLISECONDS);
    }

    static class LongRunningTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println("long running finished");
        }
    }

    static class FixedDelayTask implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis());
        }
    }

}
