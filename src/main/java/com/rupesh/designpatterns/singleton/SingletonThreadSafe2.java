package com.rupesh.designpatterns.singleton;

public class SingletonThreadSafe2 {

    private SingletonThreadSafe2() {

    }

    public static SingletonThreadSafe2 getInstance() {
        return SingletonHelper.SINGLETON_INSTANCE;
    }

    private static class SingletonHelper {
        private static final SingletonThreadSafe2 SINGLETON_INSTANCE = new SingletonThreadSafe2();
    }
}
