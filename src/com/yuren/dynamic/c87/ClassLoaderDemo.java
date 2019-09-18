package com.yuren.dynamic.c87;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-09-19 00:29
 */
public class ClassLoaderDemo {

    public static void main(String[] args) {
        ClassLoader cl = ClassLoaderDemo.class.getClassLoader();
        while (cl != null) {
            System.out.println(cl.getClass().getName());
            cl = cl.getParent();
        }

        System.out.println(String.class.getClassLoader());
    }

}
