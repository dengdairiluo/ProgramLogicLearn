package com.yuren.collection.c41;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-27 23:28
 */
public class HashSetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.addAll(Arrays.asList("hello", "愚者"));

        for (String s : set) {
            System.out.print(s + " ");
        }
    }

}
