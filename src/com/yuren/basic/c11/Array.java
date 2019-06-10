package com.yuren.basic.c11;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-10 22:46
 */
public class Array {

    private static void reset(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        reset(arr);
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
