package com.java.designpattern.singleton.type6;

//双检查锁加volatile 安全
public class Singleton6 {


}

class Singleton{
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    return new Singleton();
                }
            }
        }
        return instance;
    }
}
