package com.yuren.cls.c17;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-19 23:13
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("---- new Child()");
        Child c = new Child();

        System.out.println("\n---- c.action()");
        c.action();

        Base b = c;
        System.out.println("\n---- b.action()");
        b.action();


        System.out.println("\n---- b.s: " + Base.s);
        System.out.println("\n---- c.s: " + Child.s);
    }
}
