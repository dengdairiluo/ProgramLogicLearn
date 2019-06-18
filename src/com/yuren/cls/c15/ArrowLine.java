package com.yuren.cls.c15;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-18 23:27
 */
public class ArrowLine extends Line {

    private boolean startArrow;
    private boolean endArrow;

    public ArrowLine(Point start, Point end, String color,
                     boolean startArrow, boolean endArrow) {
        super(start, end, color);
        this.startArrow = startArrow;
        this.endArrow = endArrow;
    }

    @Override
    public void draw() {
        super.draw();
        if (startArrow) {
            System.out.println("draw start arrow");
        }
        if (endArrow) {
            System.out.println("draw end arrow");
        }
    }
}


