package com.yuren.collection.c51;

import java.util.Set;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-30 23:36
 */
public class Worker {

    String name;
    Set<Day> availableDays;

    public Worker(String name, Set<Day> availableDays) {
        this.name = name;
        this.availableDays = availableDays;
    }

    public String getName() {
        return name;
    }

    public Set<Day> getAvailableDays() {
        return availableDays;
    }

}
