package com.demo.proxy.staticproxy;

public class Proxy extends Subject {

    private RealSubject realSubject;

    @Override
    public void sayHello() {
        if (null == realSubject){
            realSubject = new RealSubject();
        }
        realSubject.sayHello();
    }
}
