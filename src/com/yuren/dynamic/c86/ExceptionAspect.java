package com.yuren.dynamic.c86;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-29 23:50
 */
public class ExceptionAspect {
    public static void exception(Object object,
                                 Method method, Object[] args, Throwable e) {
        System.err.println("exception when calling: " + method.getName()
                + "," + Arrays.toString(args));
    }
}
