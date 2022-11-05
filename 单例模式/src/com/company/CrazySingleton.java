package com.company;

/**
 *  饿汉模式的单例模式
 */

public class CrazySingleton {
    private static CrazySingleton uniqueInstance = new CrazySingleton();
    private CrazySingleton(){}
    private String name = "Crazy Instance";

    public static  CrazySingleton getInstance(){
        System.out.println(uniqueInstance.name);
        return uniqueInstance;
    }
}

