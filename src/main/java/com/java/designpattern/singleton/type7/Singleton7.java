package com.java.designpattern.singleton.type7;

//静态内部单例 安全
public class Singleton7 {
}

class Singleton{
     ;
    public static class instance{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance.instance;
    }

}
