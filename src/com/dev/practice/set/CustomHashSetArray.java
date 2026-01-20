package com.dev.practice.set;

class MyCustomSet<T> {
  private Object[] data;
  private int size;
  private static final int initialCapacity=10;
  public MyCustomSet() {
      data=new Object[initialCapacity];
      size=0;
  }
  public boolean add(T value) {
      if(contain(value)) {
        return false;
      }
      ensureCapacity();
      data[size++]=value;
      return true;
  }

  public boolean remove(T value) {
      for(int i=0;i<size;i++) {
          if(data[i]==value) {
              for(int j=i;j<size-1;j++) {
                  data[j]=data[j+1];
              }
              data[size-1]=null;
              size--;
              return true;
          }
      }
      return false;
  }

  private void ensureCapacity() {
      if(size==data.length) {
          Object[] newData=new Object[2*initialCapacity];
          for(int i=0;i<data.length;i++) {
              newData[i]=data[i];
          }
          data=newData;
      }
    }

    public boolean contain(T value) {
      for(int i=0;i<size;i++) {
          if(data[i]==value) {
              return true;
          }
      }
      return false;
  }
  public int size() {
      return size;
  }
  public boolean isEmpty() {
      return size==0;
  }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
public class CustomHashSetArray {
    public static void main(String[] args) {
        MyCustomSet<String> set = new MyCustomSet<>();

        set.add("A");
        set.add("B");
        set.add("A"); // duplicate → ignored

        System.out.println(set);       // [A, B]
        System.out.println(set.size()); // 2
        System.out.println(set.contain("B")); // true

        set.remove("A");
        System.out.println("---"+set);
    }
}
