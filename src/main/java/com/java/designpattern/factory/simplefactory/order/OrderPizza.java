package com.java.designpattern.factory.simplefactory.order;

import com.java.designpattern.factory.pizza.CheesePizza;
import com.java.designpattern.factory.pizza.GreekPizza;
import com.java.designpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {


    public OrderPizza(){

        do{
            String pizzaType = getType();
            Pizza pizza = SimpleFactory.createPizza(pizzaType);
            if(pizza != null){
                pizza.cut();
                pizza.prepare();
            }else {
                break;
            }

        }while (true);


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
