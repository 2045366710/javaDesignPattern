package com.java.designpattern.proxy.staticproxy;

public class TeacherDao implements ITeacherDao{
    public void teach() {
        System.out.println("静态代理目标对象方法执行....");
    }
}
