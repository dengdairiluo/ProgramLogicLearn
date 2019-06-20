package com.yuren.cls.c18;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-21 01:02
 */
public class ChildV4 {
    private BaseV1 base;
    private long sum;

    public ChildV4() {
        base = new BaseV1();
    }

    public void add(int number) {
        base.add(number);
        sum += number;
    }

    public void addAll(int[] numbers) {
        base.addAll(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }
}
