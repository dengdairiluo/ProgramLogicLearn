package com.yuren.collection.c52;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-03 00:33
 */
public class MyCollection<E> extends AbstractCollection<E> {
    DynamicArray<E> darr;

    public MyCollection() {
        darr = new DynamicArray<>();
    }

    public MyCollection(Collection<? extends E> c) {
        this();
        addAll(c);
    }

    @Override
    public Iterator<E> iterator() {
        return new DynamicArrayIterator<>(darr);
    }

    @Override
    public int size() {
        return darr.size();
    }

    @Override
    public boolean add(E e) {
        darr.add(e);
        return true;
    }
}
