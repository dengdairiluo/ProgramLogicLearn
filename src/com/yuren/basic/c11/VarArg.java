package com.yuren.basic.c11;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-10 22:51
 */
public class VarArg {

    public static int max(int min, int... a) {
        int max = min;
        for (int value : a) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(0));
        System.out.println(max(0, 2));
        System.out.println(max(0, 2, 4));
        System.out.println(max(0, 2, 4, 5));
    }
}
