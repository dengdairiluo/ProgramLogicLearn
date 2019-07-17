package com.yuren.concurrent.c80;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-17 23:44
 */
public class BasicTimer {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new DelayTask(), 1000);
        Thread.sleep(2000);
        timer.cancel();
    }

    static class DelayTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("delayed task");
        }
    }
}
