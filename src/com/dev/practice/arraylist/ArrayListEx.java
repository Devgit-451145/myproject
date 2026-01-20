package com.dev.practice.arraylist;

public class ArrayListEx {
    public static void main(String[] args) {
      MyCustomArraList list=new MyCustomArraList<>();
      list.add("dev");
      list.add("ved");
      list.add("kaka");
      System.out.println("TOTAL SIZE:::"+list.getSize());
      list.remove(2);
      System.out.println("after remove size"+list.getSize());
      list.insert(3,"dddd");
      list.print();

    }
}
class MyCustomArraList<T>
{
  private Object[] arr;
  private int size;

  public MyCustomArraList() {
      arr=new Object[15]; //initial capacity
      size=0;
  }
  public void add(T value) {
      if(size==arr.length) {
          grow();
      }
      arr[size++]=value;
  }
  public void insert(int index, T value) {
        if(size==arr.length) {
            grow();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
    }
  private void grow() {
     Object [] newArray=new Object[2* arr.length];
     for(int i=0;i< arr.length;i++) {
         newArray[i]=arr[i];
     }
     arr=newArray;
    }
    public T get(int index) {
      if(index<0 && index>=size) {
          throw new ArrayIndexOutOfBoundsException();
      }
      return (T) arr[index];
  }
  public void remove(int index) {
      if (index < 0 || index >= size) {
          throw new IndexOutOfBoundsException();
      }
      for(int i=index;i<size-1;i++) {
          arr[i]=arr[i+1];
      }
      size--;
  }
  public int getSize() {
      return size;
  }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}