package com.company;

public class Main {

    public static void main(String[] args) {
        LazySingleton.getInstance();
        LazySingletonAgainstThread.getInstance();
        CrazySingleton.getInstance();
        CrazySingletonAgainstThread.getInstance();
    }
}
