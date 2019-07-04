package com.yuren.file.c61;

import java.nio.charset.StandardCharsets;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-05 01:34
 */
public class Producer {

    public static void main(String[] args) throws InterruptedException {
        try {
            BasicQueue queue = new BasicQueue("./", "task");
            int i = 0;
            Random rnd = new Random();
            while (true) {
                String msg = "task " + (i++);
                queue.enqueue(msg.getBytes(StandardCharsets.UTF_8));
                System.out.println("produce: " + msg);
                Thread.sleep(rnd.nextInt(1000));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
