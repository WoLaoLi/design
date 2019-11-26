package com.cn.xx.designpatterns.factory.factorymethod.pizzastore.pizza;

/**
 * @Author: ldl
 * @Date: 2019/10/31 14:07
 * @Version 1.0
 * @Des:
 */
public class BJChessPizza extends Pizza {



    @Override
    public void prepare() {
        setName("bj-nl");
        System.out.println("bj nl 开始准备");
    }
}
