package com.yuren.collection.c51;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-30 23:35
 */
public class EnumSetDemo {

    public static void day() {
        Set<Day> weekend = EnumSet.noneOf(Day.class);
        weekend.add(Day.SATURDAY);
        weekend.add(Day.SUNDAY);
        System.out.println(weekend);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        day();
    }

}
