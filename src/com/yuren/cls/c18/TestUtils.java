package com.yuren.cls.c18;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-21 01:03
 */
public class TestUtils {

//	public static void main(String[] args) {
//		Child c = new Child();
//		c.addAll(new int[]{1,2,3});
//		System.out.println(c.getSum());
//	}

    public static void main(String[] args) {
        ChildV1 c = new ChildV1();
        c.addAll(new int[]{1, 2, 3});
//		c.clear();
//		c.addAll(new int[]{1,2,3});
        System.out.println(c.getSum());
    }
}
