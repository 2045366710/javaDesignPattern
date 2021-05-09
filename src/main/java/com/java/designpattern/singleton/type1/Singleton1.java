package com.java.designpattern.singleton.type1;

//饿汉式 静态变量单例
public class Singleton1 {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}


class Singleton {

    private Singleton() {

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}