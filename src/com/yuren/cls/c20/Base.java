package com.yuren.cls.c20;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-21 21:52
 */
public class Base extends AbstractAdder {
    private static final int MAX_NUM = 1_000;
    private int[] arr = new int[MAX_NUM];
    private int count;

    @Override
    public void add(int number) {
        if (count < MAX_NUM) {
            arr[count++] = number;
        }
    }
}
