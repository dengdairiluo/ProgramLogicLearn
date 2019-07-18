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
public class TimerFixedRate {

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();

        timer.schedule(new LongRunningTask(), 10);
        timer.scheduleAtFixedRate(new FixedRateTask(), 100, 1000);
    }

    static class LongRunningTask extends TimerTask {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println("long running finished");
        }
    }

    static class FixedRateTask extends TimerTask {

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis());
        }
    }

}
