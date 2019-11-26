package com.cn.xx.designpatterns.factory.absfactory.pizzastore.order;

import com.cn.xx.designpatterns.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author: ldl
 * @Date: 2019/11/1 13:44
 * @Version 1.0
 * @Des: 一个抽象工厂模式的抽象层  是个借口
 */
public interface AbsFactory {

    /**
     * 创建  让下面的工厂子类来具体实现
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);

}
