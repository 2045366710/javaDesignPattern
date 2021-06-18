package com.java.designpattern.proxy.jdkDynamic;

public class TeacherDao implements ITeacherDao{
    public void teach() {
        System.out.println("jdk 动态代理目标对象方法执行....");
    }

    public String sayHello() {
        System.out.println("jdk 动态代理目标对象方法执行sayHello....");
        return "sayHello";
    }
}
