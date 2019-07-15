package com.yuren.concurrent.c76;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-15 23:49
 */
public class DelayedQueueDemo {
    private static final AtomicLong taskSequencer = new AtomicLong(0);

    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedTask> tasks = new DelayQueue<>();
        tasks.put(new DelayedTask(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("execute delayed task");
            }
        }));

        DelayedTask task = tasks.take();
        task.getTask().run();
    }

    static class DelayedTask implements Delayed {
        private long runTime;
        private long sequence;
        private Runnable task;

        public DelayedTask(int delayedSeconds, Runnable task) {
            this.runTime = System.currentTimeMillis() + delayedSeconds * 1000;
            this.sequence = taskSequencer.getAndIncrement();
            this.task = task;
        }

        @Override
        public int compareTo(Delayed o) {
            if (o == this) {
                return 0;
            }
            if (o instanceof DelayedTask) {
                DelayedTask other = (DelayedTask) o;
                if (runTime < other.runTime) {
                    return -1;
                } else if (runTime > other.runTime) {
                    return 1;
                } else if (sequence < other.sequence) {
                    return -1;
                } else {
                    return 1;
                }
            }
            throw new IllegalArgumentException();
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(runTime - System.currentTimeMillis(),
                    TimeUnit.MICROSECONDS);
        }

        public Runnable getTask() {
            return task;
        }
    }
}
