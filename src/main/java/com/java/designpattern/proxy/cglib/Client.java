package com.java.designpattern.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxy = (TeacherDao) proxyFactory.getProxyInstance();
        proxy.teach();
    }
}
