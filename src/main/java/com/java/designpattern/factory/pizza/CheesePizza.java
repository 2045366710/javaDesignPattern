package com.java.designpattern.factory.pizza;

public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println(this.name+"prepare。。。。。");
    }
}
