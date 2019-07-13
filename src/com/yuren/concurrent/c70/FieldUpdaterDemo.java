package com.yuren.concurrent.c70;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-13 23:26
 */
public class FieldUpdaterDemo {

    public static void main(String[] args) {
        DemoObject obj = new DemoObject();
        obj.compareAndSetNum(0, 100);
        obj.compareAndSetRef(null, "hello");
        System.out.println(obj.getNum());
        System.out.println(obj.getRef());
    }

    static class DemoObject {
        private static final AtomicIntegerFieldUpdater<DemoObject> numUpdater
                = AtomicIntegerFieldUpdater.newUpdater(DemoObject.class, "num");
        private static final AtomicReferenceFieldUpdater<DemoObject, Object>
                refUpdater = AtomicReferenceFieldUpdater.newUpdater(
                DemoObject.class, Object.class, "ref");
        private volatile int num;
        private volatile Object ref;

        public boolean compareAndSetNum(int expect, int update) {
            return numUpdater.compareAndSet(this, expect, update);
        }

        public int getNum() {
            return num;
        }

        public Object compareAndSetRef(Object expect, Object update) {
            return refUpdater.compareAndSet(this, expect, update);
        }

        public Object getRef() {
            return ref;
        }
    }
}
