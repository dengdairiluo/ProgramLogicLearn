package com.yuren.collection.c35;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-26 23:40
 */
public class NumberPair<U extends Number, V extends Number> extends Pair<U, V> {

    public NumberPair(U first, V second) {
        super(first, second);
    }
    
    public double sum(){
        return getFirst().doubleValue()
                +getSecond().doubleValue();
    }
    
    public static void main(String[] args){
    	NumberPair<Integer, Double> pair = new NumberPair<>(10, 12.34);
    	double sum = pair.sum();
    }
}    
