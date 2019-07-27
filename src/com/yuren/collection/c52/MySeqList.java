package com.yuren.collection.c52;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ListIterator;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-03 00:35
 */
public class MySeqList<E> extends AbstractSequentialList<E> {
    private DynamicArray<E> darr;

    public MySeqList() {
        darr = new DynamicArray<>();
    }

    public MySeqList(Collection<? extends E> c) {
        this();
        addAll(c);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return new DynamicArrayListIterator<>(index, darr);
    }

    @Override
    public int size() {
        return darr.size();
    }
}    
