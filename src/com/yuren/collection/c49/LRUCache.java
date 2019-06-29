package com.yuren.collection.c49;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-29 17:34
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private static final long serialVersionUID = 4582221464546420890L;
    private int maxEntries;

    public LRUCache(int maxEntries) {
        super(16, 0.75f, true);
        this.maxEntries = maxEntries;
    }

    public static void main(String[] args) {
        LRUCache<String, Object> cache = new LRUCache<>(3);
        cache.put("a", "abstract");
        cache.put("b", "basic");
        cache.put("c", "call");
        cache.get("a");

        cache.put("d", "call");
        System.out.println(cache);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxEntries;
    }

}
