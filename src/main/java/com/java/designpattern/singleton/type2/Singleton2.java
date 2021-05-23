package com.java.designpattern.singleton.type2;

//饿汉式静态代码块
public class Singleton2 {

    public static void main(String[] args) {

    }
}


class Singleton{
    private Singleton(){
    }

    private static Singleton instance;
    static{
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
