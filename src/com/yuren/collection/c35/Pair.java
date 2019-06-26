package com.yuren.collection.c35;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-26 23:40
 */
public class Pair<U, V> {

    U first;
    V second;
    
    public Pair(U first, V second){
        this.first = first;
        this.second = second;
    }
    
    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}