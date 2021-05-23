package com.java.designpattern.singleton.type5;
//同步锁代码块
public class Singleton5 {
}


class Singleton{
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                return new Singleton();
            }
        }

        return instance;
    }
}


