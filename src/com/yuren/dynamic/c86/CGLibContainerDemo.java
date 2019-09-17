package com.yuren.dynamic.c86;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-09-17 22:26
 */
public class CGLibContainerDemo {

    public static void main(String[] args) {

        ServiceA a = CGLibContainer.getInstance(ServiceA.class);
        a.callB();

    }
}
