package com.cn.xx.designpatterns.factory.absfactory.pizzastore.pizza;

/**
 * @Author: ldl
 * @Date: 2019/10/31 14:07
 * @Version 1.0
 * @Des:
 */
public class LDPepperPizza extends Pizza {



    @Override
    public void prepare() {
        setName("ld-hj");
        System.out.println("ld hj 开始准备");
    }
}
