package com.cn.xx.designpatterns.factory.absfactory.pizzastore.pizza;

/**
 * @Author: ldl
 * @Date: 2019/10/31 14:07
 * @Version 1.0
 * @Des:
 */
public class BJPepperPizza extends Pizza {



    @Override
    public void prepare() {
        setName("bj-hj");
        System.out.println("bj hj 开始准备");
    }
}
