package com.dev.practice.designpatterns;

public class SignletonEx {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
class Singleton {
    private static Singleton instance;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if(instance==null) {
            instance=new Singleton();
        }
        return instance;
    }
}

//double check locking
class SingletonThread {
    //volatile ensures visibility across threads
    private static volatile SingletonThread instance;
    //private constuctor
    private SingletonThread() {

    }

    public static SingletonThread getInstance() {
        if(instance==null) {
            synchronized (SingletonThread.class) {
                if(instance==null) {
                    instance=new SingletonThread();
                }
            }
            return instance;
        }
        return null;
    }
}