package com.dev.practice.map;

import java.util.HashMap;

public class LastAccessedKey {
    public static void main(String[] args) {
     MyMap<String,String> map=new MyMap<>();
     map.put("1","dev");
     map.put("2","ved");
     System.out.println(map.get("1"));
     System.out.println(map.getLastAccessedKey());
     map.remove("1");
     System.out.println(map.getLastAccessedKey());

    }
}
class MyMap<K,V>
{
    private HashMap<K,V> map;
    private K lastAccessedKey;
    public MyMap() {
        map=new HashMap<>();
        lastAccessedKey=null;
    }
    public void put(K key,V value) {
        map.put(key,value);
    }
    public V get(K key) {
        V value=map.get(key);
        if(value!=null) {
            lastAccessedKey=key;
        }
        return value;
    }
    public void remove(K key) {
        map.remove(key);
        if(key==lastAccessedKey) {
            lastAccessedKey=null;
        }
    }
    public K getLastAccessedKey() {
        return lastAccessedKey;
    }
}