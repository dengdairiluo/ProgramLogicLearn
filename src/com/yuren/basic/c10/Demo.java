package com.yuren.basic.c10;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-09 23:35
 */
public class Demo {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("please input password");
        int num = reader.nextInt();
        int password = 6789;
        while (num != password) {
		    System.out.println("please input password");
            num = reader.nextInt();
        }
        System.out.println("correct");
        reader.close();
    }
}
