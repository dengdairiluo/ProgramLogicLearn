package com.yuren.cls.c18;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-21 01:02
 */
public class BaseV3 {
    private static final int MAX_NUM = 1000;
    private int[] arr = new int[MAX_NUM];
    private int count;

    public void add(int number) {
        if (count < MAX_NUM) {
            arr[count++] = number;
        }
    }

    public void addAll(int[] numbers) {
        for (int num : numbers) {
            add(num);
        }
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        count = 0;
    }
}
