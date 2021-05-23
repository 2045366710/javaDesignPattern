package com.java.designpattern.singleton.type4;

//同步方法单例
public class Singleton4 {
}


class Singleton{
    private static Singleton instance;
    public synchronized static Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }

        return instance;

    }
}
