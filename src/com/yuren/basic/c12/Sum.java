package com.yuren.basic.c12;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-11 23:43
 */
public class Sum {
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int d = Sum.sum(1, 2);
        System.out.println(d);
    }
}
