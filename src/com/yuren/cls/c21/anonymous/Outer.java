package com.yuren.cls.c21.anonymous;

import com.yuren.cls.c14.Point;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-22 23:09
 */
public class Outer {
    public void test(final int x, final int y) {
        Point p = new Point(2, 3) {

            @Override
            public double distance() {
                return distance(new Point(x, y));
            }
        };

        System.out.println(p.distance());
    }

}
