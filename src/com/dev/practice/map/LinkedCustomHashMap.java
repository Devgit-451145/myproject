package com.dev.practice.map;

import java.util.LinkedHashMap;

public class LinkedCustomHashMap<K, V> {
    private final LinkedHashMap<K, V> map;
    private K lastAccessedKey;  // Instance variable to store the last accessed key
    public LinkedCustomHashMap() {
        // Using true for access order to keep track of the last accessed key.
        map = new LinkedHashMap<>(16, 0.75f, true);
        lastAccessedKey = null;
    }
    // Put method
    public void put(K key, V value) {
        map.put(key, value);
        lastAccessedKey = key;  // Update last accessed key on put
    }
    // Get method
    public V get(K key) {
        V value = map.get(key);
        if (value != null) {
            lastAccessedKey = key;  // Update last accessed key on get
        }
        return value;
    }
    // Remove method
    public V remove(K key) {
        V value = map.remove(key);
        if (key.equals(lastAccessedKey)) {
            lastAccessedKey = null;  // Reset last accessed key if the removed key was the last accessed one
        }
        return value;
    }
    // Get last accessed key
    public K getLastAccessedKey() {
        return lastAccessedKey;
    }
    public static void main(String[] args) {
        LinkedCustomHashMap<String, String> myMap = new LinkedCustomHashMap<>();
        // Put values into the map
        myMap.put("A", "Apple");
        myMap.put("B", "Banana");
        myMap.put("C", "Cherry");
        // Get a value (this should update the last accessed key)
        System.out.println("Get A: " + myMap.get("A"));
        // Remove a value
        myMap.remove("B");
        // Track the last accessed key
        System.out.println("Last Accessed Key: " + myMap.getLastAccessedKey());
        // Output map contents after operations
        System.out.println("Map Contents: " + myMap.map);
    }
}




