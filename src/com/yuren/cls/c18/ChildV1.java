package com.yuren.cls.c18;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-21 01:02
 */
public class ChildV1 extends BaseV1 {
    private long sum;

    @Override
    public void add(int number) {
        super.add(number);
        sum += number;
    }

    @Override
    public void addAll(int[] numbers) {
        super.addAll(numbers);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }
}
