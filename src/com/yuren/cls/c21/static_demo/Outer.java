package com.yuren.cls.c21.static_demo;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-22 23:10
 */
public class Outer {

    private static int shared = 100;

    public void test() {
        StaticInner si = new StaticInner();
        si.innerMethod();
    }

    public static class StaticInner {
        public void innerMethod() {
            System.out.println("inner " + shared);
        }
    }
}
