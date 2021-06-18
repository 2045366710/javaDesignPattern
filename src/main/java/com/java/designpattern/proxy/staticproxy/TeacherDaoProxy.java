package com.java.designpattern.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao iTeacherDao;
    public TeacherDaoProxy(ITeacherDao iTeacherDao){
        this.iTeacherDao = iTeacherDao;
    }

    public void teach() {
        System.out.println("静态代理目标对象执行前");
        iTeacherDao.teach();
        System.out.println("静态代理目标对象执行后");

    }
}
