package com.yuren.concurrent.c74;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-15 23:48
 */
public class ConcurrentHashMapIteratorDemo {

    public static void test() {
        final ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("a", "abstract");
        map.put("b", "basic");

        Thread t1 = new Thread(() -> {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(entry.getKey() + "," + entry.getValue());
            }
        });
        t1.start();
        // 确保线程t1启动
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        map.put("c", "call");
    }

    public static void main(String[] args) {
        test();
    }

}
