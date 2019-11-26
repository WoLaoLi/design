package com.cn.xx.designpatterns.factory.absfactory.pizzastore.order;

/**
 * @Author: ldl
 * @Date: 2019/11/1 13:55
 * @Version 1.0
 * @Des:
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }

}
