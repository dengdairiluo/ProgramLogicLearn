package com.yuren.java8.c92;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2020-04-26 23:29
 */
public class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
