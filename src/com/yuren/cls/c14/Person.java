package com.yuren.cls.c14;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-16 23:16
 */
public class Person {
    //姓名
    private String name;

    //父亲
    private Person father;

    //母亲
    private Person mother;

    //孩子数组
    private Person[] children;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person yuRen = new Person("愚人");
        Person yuZhe = new Person("愚者");

        yuZhe.setFather(yuRen);
        yuRen.setChildren(new Person[]{yuZhe});

        System.out.println(yuZhe.getFather().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }
}
