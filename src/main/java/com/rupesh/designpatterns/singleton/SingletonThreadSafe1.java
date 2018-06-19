package com.rupesh.designpatterns.singleton;

public class SingletonThreadSafe1 {

    private volatile static SingletonThreadSafe1 singletonInstance;

    private SingletonThreadSafe1() {

    }

    public SingletonThreadSafe1 getInstance() {
        if (singletonInstance == null) {
            // To make thread safe
            synchronized (SingletonThreadSafe1.class) {
                // check again as multiple threads
                // can reach above step
                if (singletonInstance == null) {
                    singletonInstance = new SingletonThreadSafe1();
                }
            }
        }
        return singletonInstance;
    }
}
