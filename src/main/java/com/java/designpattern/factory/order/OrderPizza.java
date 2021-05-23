package com.java.designpattern.factory.order;

import com.java.designpattern.factory.pizza.CheesePizza;
import com.java.designpattern.factory.pizza.GreekPizza;
import com.java.designpattern.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza(){
        do{
            String pizzaType = getType();
            Pizza pizza = null;
            if("cheese".equals(pizzaType)){
                pizza = new CheesePizza();
            }else if("greek".equals(pizzaType)){
                pizza = new GreekPizza();
            }else {
                break;
            }

            pizza.prepare();
            pizza.cut();
        }while(true);
    }


    private String getType(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("type:");

        try {
            String s = bf.readLine();

            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
