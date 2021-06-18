package com.java.designpattern.proxy.jdkDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行jdk 动态代理目标对象方法前....");
                        Object result = method.invoke(target, args);
                        System.out.println("执行jdk 动态代理目标对象方法后....");
                        return result;
                    }
                });
    }

}
