package com.yuren.cls.c14;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-12 23:11
 */
public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        Point start = new Point(2, 3);
        Point end = new Point(3, 4);

        Line line = new Line(start, end);
        System.out.println(line.length());
    }

    public double length() {
        return start.distance(end);
    }
}
