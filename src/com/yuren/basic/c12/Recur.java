package com.yuren.basic.c12;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-11 23:42
 */
public class Recur {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int ret = factorial(4);
        System.out.println(ret);
    }
}
