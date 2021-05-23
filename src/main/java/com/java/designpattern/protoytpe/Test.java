package com.java.designpattern.protoytpe;

public class Test implements Cloneable{
    public static void main(String[] args) {
        Test test = new Test();
        try {
            Test test2 = (Test) test.clone();
            System.out.println(test ==test2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Test test = null;
        try{
            test = (Test) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
        return test;
    }
}
