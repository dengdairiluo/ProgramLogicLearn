package com.yuren.concurrent.c68;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-11 00:58
 */
public interface MyFuture<V> {
    V get() throws Exception;
}
