package com.dev.practice.set;

import java.util.ArrayList;

class MySet<T> {
    private ArrayList<T> elements;
    MySet() {
        elements=new ArrayList<>();
    }
    public boolean add(T value) {
     if(!contains(value)) {
         elements.add(value);
         return true;
     }
     return false;
    }
    public void remove(T value) {
        elements.remove(value);
    }
    public void clear() {
        elements.clear();
    }
    public int size() {
        return elements.size();
    }

    private boolean contains(T value) {
        return elements.contains(value);
    }
}

public class CustomHashSetWithArraylist {
    public static void main(String[] args) {
        MySet<Integer> set=new MySet<>();
        set.add(2);
        set.add(2);


    }
}
