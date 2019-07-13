package com.yuren.concurrent.c70;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-13 23:25
 */
public class AtomicArrayDemo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        AtomicIntegerArray atomicArr = new AtomicIntegerArray(arr);
        atomicArr.compareAndSet(1, 2, 100);
        System.out.println(atomicArr.get(1));
        System.out.println(arr[1]);
    }

}
