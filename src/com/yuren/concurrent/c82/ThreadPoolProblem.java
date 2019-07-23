package com.yuren.concurrent.c82;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-23 23:33
 */
public class ThreadPoolProblem {
    static ThreadLocal<AtomicInteger> sequencer = ThreadLocal.withInitial(() -> new AtomicInteger(0));

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());
        executor.shutdown();
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                AtomicInteger s = sequencer.get();
                int initial = s.getAndIncrement();
                // 期望初始为0
                System.out.println(initial);
            } finally {
                sequencer.remove();
            }
        }
    }
}
