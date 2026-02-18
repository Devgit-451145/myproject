package com.dev.practice;

import java.util.*;

public class RedisLikeStore {

    private final Map<String, Entry> store = new HashMap<>();
    // SET key value
    public void set(String key, String value) {
        store.put(key, new Entry(ValueType.STRING, value));
    }
    // GET key
    public String get(String key) {
        Entry entry = store.get(key);
        if (entry == null) return null;
        if (entry.getType() != ValueType.STRING) {
            throw new IllegalStateException("WRONGTYPE Operation against a key holding the wrong kind of value");
        }
        return (String) entry.getValue();
    }
    // LPUSH key value
    public void lpush(String key, String value) {
        Entry entry = store.get(key);
        if (entry == null) {
            LinkedList<String> list = new LinkedList<>();
            list.addFirst(value);
            store.put(key, new Entry(ValueType.LIST, list));
        }
        else if (entry.getType() == ValueType.LIST) {
            @SuppressWarnings("unchecked")
            LinkedList<String> list = (LinkedList<String>) entry.getValue();
            list.addFirst(value);
        }
        else {
            throw new IllegalStateException("WRONGTYPE Operation against a key holding the wrong kind of value");
        }
    }
    // LRANGE key
    public List<String> lrange(String key) {
        Entry entry = store.get(key);
        if (entry == null) return Collections.emptyList();
        if (entry.getType() != ValueType.LIST) {
            throw new IllegalStateException("WRONGTYPE Operation against a key holding the wrong kind of value");
        }
        @SuppressWarnings("unchecked")
        List<String> list = (List<String>) entry.getValue();
        return new ArrayList<>(list);
    }
}

