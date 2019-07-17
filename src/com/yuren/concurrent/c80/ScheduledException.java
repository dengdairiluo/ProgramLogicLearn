package com.yuren.concurrent.c80;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-17 23:44
 */
public class ScheduledException {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService timer = Executors
                .newSingleThreadScheduledExecutor();
        timer.scheduleWithFixedDelay(new TaskA(), 0, 1, TimeUnit.SECONDS);
        timer.scheduleWithFixedDelay(new TaskB(), 2, 1, TimeUnit.SECONDS);
    }

    static class TaskA implements Runnable {

        @Override
        public void run() {
            System.out.println("task A");
        }
    }

    static class TaskB implements Runnable {

        @Override
        public void run() {
            System.out.println("task B");
            throw new RuntimeException();
        }
    }

}
