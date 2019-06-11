package com.yuren.basic.c12;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-11 23:39
 */
public class ArrayMax {

    private static int max(int min, int[] arr) {
        int max = min;
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4};
        int ret = max(0, arr);
        System.out.println(ret);
    }
}
