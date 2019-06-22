package com.yuren.cls.c21.member;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-22 23:10
 */
public class Outer {
    private int a = 100;

    private void action() {
        System.out.println("action");
    }

    public void test() {
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public class Inner {
        public void innerMethod() {
            System.out.println("outer a " + a);
            Outer.this.action();
        }
    }
}
