package com.yuren.cls.c20;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-21 21:51
 */
public abstract class AbstractAdder implements IAdd {
    @Override
    public void addAll(int[] numbers) {
        for (int num : numbers) {
            add(num);
        }
    }
}
