package com.yuren.concurrent.c82;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-23 23:33
 */
public class ThreadLocalInit {
    static ThreadLocal<Integer> local = ThreadLocal.withInitial(() -> 100);

    public static void main(String[] args) {
        System.out.println(local.get());
        local.set(200);
        local.remove();
        System.out.println(local.get());
    }
}
