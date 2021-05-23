package com.java.designpattern.singleton.type3;
//懒汉式 线程不安全
public class Singleton3
{
}

class Singleton{
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }
}


