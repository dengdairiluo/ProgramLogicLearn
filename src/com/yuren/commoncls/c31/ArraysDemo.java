package com.yuren.commoncls.c31;

import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-24 22:31
 */
public class ArraysDemo {

    public static void basic() {
        int[] arr = {9, 8, 3, 4};
        System.out.println(Arrays.toString(arr));

        String[] strArr = {"hello", "world"};
        System.out.println(Arrays.toString(strArr));
    }

    public static void sort() {
        int[] arr = {4, 9, 3, 6, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param args
     */
    public static void main(String[] args) {


    }

}
