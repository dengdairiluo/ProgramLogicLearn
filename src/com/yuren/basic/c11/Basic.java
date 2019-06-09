package com.yuren.basic.c11;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-09 23:37
 */
public class Basic {

    private static int sum(int a, int b) {
        return a + b;
    }

    private static void print3Lines() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int sum = sum(a, b);

        System.out.println(sum);
        print3Lines();
        System.out.println(sum(3, 4));

    }
}
