package com.dev.practice.arraylist;

import java.util.ArrayList;

class MyArrayListDev extends ArrayList
{
    @Override
    public boolean add(Object o) {
        if(this.contains(o)) {
            return true;
        } else {
            return super.add(o);
        }
    }
}
public class ArrayListWithNoDuplicate {
    public static void main(String[] args) {
        MyArrayListDev ml=new MyArrayListDev();
        ml.add("dev");
        ml.add("dev");
        System.out.println(ml.size());
    }

}
