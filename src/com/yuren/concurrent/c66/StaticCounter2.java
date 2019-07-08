package com.yuren.concurrent.c66;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-09 00:18
 */
public class StaticCounter2 {

    private static int count = 0;

    public static void incr() {
        synchronized (StaticCounter.class) {
            count++;
        }
    }

    public static int getCount() {
        synchronized (StaticCounter.class) {
            return count;
        }
    }

}
