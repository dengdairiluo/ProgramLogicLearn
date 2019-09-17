package com.yuren.dynamic.c86;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-09-17 22:54
 */
public class GeneralProxyDemo {
    @SuppressWarnings("unchecked")
    private static <T> T getProxy(Class<T> intf, T realObj) {
        return (T) Proxy.newProxyInstance(intf.getClassLoader(), new Class<?>[]{intf},
                (InvocationHandler) new SimpleInvocationHandler(realObj));
    }

    public static void main(String[] args) throws Exception {
        IServiceA a = new ServiceAImpl();
        IServiceA aProxy = getProxy(IServiceA.class, a);
        aProxy.sayHello();

        IServiceB b = new ServiceBImpl();
        IServiceB bProxy = getProxy(IServiceB.class, b);
        bProxy.fly();
    }

    interface IServiceA {
        void sayHello();
    }

    interface IServiceB {
        void fly();
    }

    static class ServiceAImpl implements IServiceA {

        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class ServiceBImpl implements IServiceB {

        @Override
        public void fly() {
            System.out.println("flying");
        }
    }

    static class SimpleInvocationHandler implements InvocationHandler {
        private Object realObj;

        public SimpleInvocationHandler(Object realObj) {
            this.realObj = realObj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("entering " + realObj.getClass().getSimpleName() + "::" + method.getName());
            Object result = method.invoke(realObj, args);
            System.out.println("leaving " + realObj.getClass().getSimpleName() + "::" + method.getName());
            return result;
        }
    }
}
