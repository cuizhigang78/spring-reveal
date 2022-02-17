package com.cui;

import java.util.HashMap;

public class IoContainer<K, V> {

    private HashMap<K, V> map = new HashMap<>();

    public void register(K k, V v) {
        map.put(k, v);
    }

    public V get(K k) {
        return map.get(k);
    }
}
