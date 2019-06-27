package com.yuren.collection.c39;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-27 23:20
 */
public class LinkListDemo {

    public static void stack() {
        Deque<String> stack = new LinkedList<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        while (stack.peek() != null) {
            System.out.println(stack.pop());
        }
    }

    public static void reverse() {
        Deque<String> deque = new LinkedList<>(
                Arrays.asList("a", "b", "c"));
        Iterator<String> it = deque.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
