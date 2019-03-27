package com.demo.proxy.staticproxy;

public class RealSubject extends Subject {
    @Override
    public void sayHello() {
        System.out.println("hello 静态代理");
    }
}
