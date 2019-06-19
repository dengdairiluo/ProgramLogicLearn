package com.yuren.cls.c17;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-19 23:12
 */
public class Child extends Base {
    public static int s;

    static {
        System.out.println("子类静态代码块, s: " + s);
        s = 10;
    }

    private int a;

    {
        System.out.println("子类实例代码块, a: " + a);
        a = 10;
    }

    public Child() {
        System.out.println("子类构造方法, a: " + a);
        a = 20;
    }

    protected void step() {
        System.out.println("child s: " + s + ", a: " + a);
    }
}
