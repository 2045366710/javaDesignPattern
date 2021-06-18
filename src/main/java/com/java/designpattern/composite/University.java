package com.java.designpattern.composite;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

    List<OrganizationComponent> collegeList = new ArrayList<>();

    public University(String name,String desc){
        super(name,desc);
    }

    @Override
    public void add(OrganizationComponent organizationComponent){
        collegeList.add(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        for (OrganizationComponent organizationComponent:collegeList) {
            System.out.println(organizationComponent.getName()+organizationComponent.getDesc());
        }
    }
}
