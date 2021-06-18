package com.java.designpattern.composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华","清华大学");
        OrganizationComponent college1 = new College("计算机","计算机学院");

        OrganizationComponent college2 = new College("信息工程","信息工程学院");

        OrganizationComponent department1 = new Department("信息管理1","信息管理系1");
        OrganizationComponent department2 = new Department("信息管理2","信息管理系2");
        college1.add(new Department("信息管理1","信息管理系1"));
        college2.add(department1);
        college2.add(department2);
        university.add(college1);
        university.add(college2);
        university.print();

        System.out.println("=======================");
        college1.print();
        System.out.println("=============");
        college2.print();
        System.out.println("=============");
        department1.print();

    }
}
