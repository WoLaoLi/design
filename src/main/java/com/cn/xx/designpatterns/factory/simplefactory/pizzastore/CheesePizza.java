package com.cn.xx.designpatterns.factory.simplefactory.pizzastore;

/**
 * @Author: ldl
 * @Date: 2019/10/30 16:27
 * @Version 1.0
 * @Des:
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备材料");
    }
}
