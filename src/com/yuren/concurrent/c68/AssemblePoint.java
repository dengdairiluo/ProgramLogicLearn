package com.yuren.concurrent.c68;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-11 22:49
 */
public class AssemblePoint {

    private int n;

    public AssemblePoint(int n) {
        this.n = n;
    }

    public synchronized void await() throws InterruptedException {
        if (n > 0) {
            n--;
            if (n == 0) {
                notifyAll();
            } else {
                while (n != 0) {
                    wait();
                }
            }
        }
    }

}
