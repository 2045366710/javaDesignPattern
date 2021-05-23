package com.java.designpattern.factory.pizza;

public class GreekPizza extends Pizza {
    public void prepare() {
        System.out.println(this.name+"prepare。。。。。");
    }
}
