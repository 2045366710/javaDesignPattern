package com.java.designpattern.factory.simplefactory.pizza;

public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println(this.name+"prepare。。。。。");
    }
}
