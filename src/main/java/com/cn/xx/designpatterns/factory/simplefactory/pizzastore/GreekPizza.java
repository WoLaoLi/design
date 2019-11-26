package com.cn.xx.designpatterns.factory.simplefactory.pizzastore;

/**
 * @Author: ldl
 * @Date: 2019/10/30 16:28
 * @Version 1.0
 * @Des:
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备材料");
    }
}
