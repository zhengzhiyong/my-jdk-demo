package com.demo.proxy.staticproxy;
/**
 * @author Zhengzy
 * @param
 * @date 2019/3/27 18:01
 * @desc 模拟实现静态代理原理
 * @return
 * @exception
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.sayHello();
    }
}
