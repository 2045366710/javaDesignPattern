package com.java.designpattern.factory.simplefactory.order;

import com.java.designpattern.factory.simplefactory.pizza.CheesePizza;
import com.java.designpattern.factory.simplefactory.pizza.GreekPizza;
import com.java.designpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;

        if("cheese".equals(type)){
            pizza = new CheesePizza();
            pizza.setName("cheese");
            return pizza;
        }else if("greek".equals(type)){
            pizza = new GreekPizza();
            pizza.setName("greek");
            return pizza;
        }else {
            return pizza;
        }
    }


}
