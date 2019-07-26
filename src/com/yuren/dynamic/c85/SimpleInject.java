package com.yuren.dynamic.c85;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-26 23:31
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface SimpleInject {
}
