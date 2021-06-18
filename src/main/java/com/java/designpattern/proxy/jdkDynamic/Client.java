package com.java.designpattern.proxy.jdkDynamic;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
        String s = proxyInstance.sayHello();
        System.out.println(s);
    }
}
