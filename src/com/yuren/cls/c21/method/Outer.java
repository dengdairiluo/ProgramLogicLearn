package com.yuren.cls.c21.method;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-22 23:10
 */
public class Outer {

    private int a = 100;

    public void test(final int param) {
        final String str = "hello";
        class Inner {
            public void innerMethod() {
                System.out.println("outer a " + a);
                System.out.println("param " + param);
                System.out.println("local var " + str);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

}
