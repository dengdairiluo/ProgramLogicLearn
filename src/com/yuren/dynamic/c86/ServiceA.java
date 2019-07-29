package com.yuren.dynamic.c86;

import com.yuren.dynamic.c85.SimpleInject;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-29 23:48
 */
public class ServiceA {

    @SimpleInject
    ServiceB b;

    public void callB() {
        b.action();
    }

    public ServiceB getB() {
        return b;
    }


}
