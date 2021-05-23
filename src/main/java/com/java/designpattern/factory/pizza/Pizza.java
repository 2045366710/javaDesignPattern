package com.java.designpattern.factory.pizza;

public abstract class Pizza {

    public String name;
    private void setName(String name){
        this.name = name;
    }

    public abstract void prepare();

    public void cut(){
        System.out.println(name+"cutting。。。。。");
    }


}
