package com.yuren.java8.c93;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2020-04-26 23:29
 */
public class Student {
    String name;
    String id;
    double score;
    String grade;

    public Student(String name, String grade, double score) {
        this.name = name;
        this.id = name;
        this.score = score;
        this.grade = grade;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
