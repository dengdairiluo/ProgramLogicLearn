package com.yuren.cls.c15;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-17 23:12
 */
public class Shape {
    private static final String DEFAULT_COLOR = "black";

    private String color;

    public Shape() {
        this(DEFAULT_COLOR);
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("draw shape");
    }
}
