package m.oop.problem;

import java.util.*;

public class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;
    // Constructor to initialize the cache with a given capacity
    public LRUCache(int capacity) {
        this.capacity = capacity;
        // Creating a LinkedHashMap with accessOrder=true ensures that the order is maintained
        // in the order in which elements were last accessed (i.e., most recently accessed first)
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    // Get the value associated with the key
    public int get(int key) {
        // If the key exists, return its value, otherwise return -1
        return cache.getOrDefault(key, -1);
    }
    // Put a key-value pair into the cache
    public void put(int key, int value) {
        // If the cache reaches its capacity, remove the least recently used item
        if (cache.size() >= capacity) {
            Iterator<Map.Entry<Integer, Integer>> iterator = cache.entrySet().iterator();
            iterator.next(); // Removes the first (least recently used) element
            iterator.remove();
        }
        // Put the key-value pair in the cache
        cache.put(key, value);
    }
    // Print the cache content for debugging
    public void printCache() {
        System.out.println("Cache contents: " + cache);
    }
    public static void main(String[] args) {
        // Create an LRU Cache with capacity 3
        LRUCache lru = new LRUCache(3);
        // Test the cache
        lru.put(1, 1); // Cache: {1=1}
        lru.put(2, 2); // Cache: {1=1, 2=2}
        lru.put(3, 3); // Cache: {1=1, 2=2, 3=3}
        lru.printCache(); // Output: Cache contents: {1=1, 2=2, 3=3}

        lru.get(2); // Returns 2 and moves key 2 to the front (most recently used)
        lru.printCache(); // Output: Cache contents: {1=1, 3=3, 2=2}

        lru.put(4, 4); // Removes key 1 (least recently used), Cache: {3=3, 2=2, 4=4}
        lru.printCache(); // Output: Cache contents: {3=3, 2=2, 4=4}

        System.out.println(lru.get(1)); // Returns -1, key 1 has been evicted
        System.out.println(lru.get(3)); // Returns 3
        lru.printCache(); // Output: Cache contents: {2=2, 4=4, 3=3}
    }
}

