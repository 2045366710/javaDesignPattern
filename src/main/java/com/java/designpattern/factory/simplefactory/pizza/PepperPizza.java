package com.java.designpattern.factory.simplefactory.pizza;

public class PepperPizza extends Pizza {
    public void prepare() {
        System.out.println(this.name+"prepare.....");
    }
}
