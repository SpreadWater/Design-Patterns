package com.company;

public class CrazySingletonAgainstThread {
    private static volatile CrazySingletonAgainstThread uniqueInstance = new CrazySingletonAgainstThread();
    private CrazySingletonAgainstThread (){}
    private String name = "Crazy Singleton Against Thread";

    public static synchronized CrazySingletonAgainstThread getInstance(){
        System.out.println(uniqueInstance.name);
        return uniqueInstance;
    }
}
