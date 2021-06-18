package com.java.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    List<OrganizationComponent> departmentList = new ArrayList<>();

    public College(String name,String desc){
        super(name,desc);
    }
    public void add(OrganizationComponent organizationComponent){
        departmentList.add(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        for (OrganizationComponent organizationComponent:departmentList) {
            System.out.println(organizationComponent.getName()+organizationComponent.getDesc());
        }
    }
}
