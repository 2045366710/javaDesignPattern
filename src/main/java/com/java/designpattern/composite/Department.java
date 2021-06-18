package com.java.designpattern.composite;


public class Department extends OrganizationComponent{

    public Department(String name,String desc){
       super(name,desc);
    }
    @Override
    public void print() {
        System.out.println(this.getName());
    }
}
