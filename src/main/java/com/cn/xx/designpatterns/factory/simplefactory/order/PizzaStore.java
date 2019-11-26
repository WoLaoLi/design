package com.cn.xx.designpatterns.factory.simplefactory.order;


import java.io.IOException;

/**
 * @Author: ldl
 * @Date: 2019/10/30 16:48
 * @Version 1.0
 * @Des: 相当于客户端，发出订购请求
 */
public class PizzaStore {

    public static void main(String[] args) throws IOException {
//        new OrderPizza();
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
    }

}
