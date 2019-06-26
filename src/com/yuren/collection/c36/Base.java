package com.yuren.collection.c36;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-26 23:44
 */
class Base implements Comparable<Base>{
    private int sortOrder;
    
    public Base(int sortOrder) {
        this.sortOrder = sortOrder;
    }
    
    @Override
    public int compareTo(Base o) {
        if(sortOrder < o.sortOrder){
            return -1;
        }else if(sortOrder > o.sortOrder){
            return 1;
        }else{
            return 0;
        }
    }
}
