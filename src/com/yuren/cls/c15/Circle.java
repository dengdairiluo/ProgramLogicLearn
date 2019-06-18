package com.yuren.cls.c15;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-18 23:25
 */
public class Circle extends Shape {

    private Point center;

    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public static void main(String[] args) {
        Point center = new Point(2, 3);
        //创建圆，赋值给circle
        Circle circle = new Circle(center, 2);
        //调用draw方法，会执行Circle的draw方法
        circle.draw();
        //输出圆面积
        System.out.println(circle.area());
    }

    @Override
    public void draw() {
        System.out.println("draw circle at "
                + center.toString() + " with r " + r
                + ", using color : " + getColor());
    }

    public double area() {
        return Math.PI * r * r;
    }
}
