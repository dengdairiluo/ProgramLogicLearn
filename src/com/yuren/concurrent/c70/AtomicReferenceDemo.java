package com.yuren.concurrent.c70;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-13 23:25
 */
public class AtomicReferenceDemo {

    public static void main(String[] args) {
        Pair p = new Pair(100, 200);
        AtomicReference<Pair> pairRef = new AtomicReference<>(p);
        pairRef.compareAndSet(p, new Pair(200, 200));

        System.out.println(pairRef.get().getFirst());
    }

    static class Pair {
        final private int first;
        final private int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }

}
