package com.yuren.concurrent.c69;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-12 22:58
 */
public class InterruptWaitingDemo extends Thread {
    public static void main(String[] args) {
        InterruptWaitingDemo thread = new InterruptWaitingDemo();
        thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        thread.interrupt();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                // 模拟任务代码
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // ... 清理操作
                // 重设中断标志位
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(isInterrupted());
    }
}