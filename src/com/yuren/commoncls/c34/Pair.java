package com.yuren.commoncls.c34;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-25 22:36
 */
public class Pair {

    Object item;
    int weight;

    public Pair(Object item, int weight) {
        this.item = item;
        this.weight = weight;
    }

    public Object getItem() {
        return item;
    }

    public int getWeight() {
        return weight;
    }
}
