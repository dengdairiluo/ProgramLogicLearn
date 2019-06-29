package com.yuren.collection.c50;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-29 17:34
 */
public class Clothes {

    String id;
    Size size;

    public Clothes(String id, Size size) {
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public Size getSize() {
        return size;
    }
}
