package com.company;

/**
 *  懒汉模式处理多线程问题
 */
public class LazySingletonAgainstThread {
    private static LazySingletonAgainstThread uniqueInstance;
    private LazySingletonAgainstThread(){}
    private String name = "Lazy Singleton Against Thread";

    public static synchronized LazySingletonAgainstThread getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingletonAgainstThread();
        }
        System.out.println(uniqueInstance.name);
        return uniqueInstance;
    }
}
