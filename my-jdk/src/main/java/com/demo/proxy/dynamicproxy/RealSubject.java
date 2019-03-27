package com.demo.proxy.dynamicproxy;

public class RealSubject implements Subject {
    public void hello(String str) {
        System.out.println("hello 我是动态代理"+str);
    }

    public String bye() {
        System.out.println("Goodbye");
        return "Over";
    }
}
