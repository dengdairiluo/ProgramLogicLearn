package com.yuren.concurrent.c80;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-18 23:22
 */
public class TimerException {

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new TaskA(), 1, 1000);
        timer.schedule(new TaskB(), 2000, 1000);
    }

    static class TaskA extends TimerTask {

        @Override
        public void run() {
            System.out.println("task A");
        }
    }

    static class TaskB extends TimerTask {

        @Override
        public void run() {
            System.out.println("task B");
            throw new RuntimeException();
        }
    }

}
