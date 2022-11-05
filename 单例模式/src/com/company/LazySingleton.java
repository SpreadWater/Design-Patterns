package com.company;

/**
 * 懒汉模式的单例模式
 */
public class LazySingleton {
    private static LazySingleton uniqueInstance;
    private String name = "Lazy Instance";
    private LazySingleton (){}

    public static LazySingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new LazySingleton();
        }
        System.out.println(uniqueInstance.name);
        return uniqueInstance;
    }
}
