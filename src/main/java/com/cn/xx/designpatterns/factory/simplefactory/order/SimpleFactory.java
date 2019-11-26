package com.cn.xx.designpatterns.factory.simplefactory.order;

import com.cn.xx.designpatterns.factory.simplefactory.pizzastore.CheesePizza;
import com.cn.xx.designpatterns.factory.simplefactory.pizzastore.GreekPizza;
import com.cn.xx.designpatterns.factory.simplefactory.pizzastore.Pizza;

/**
 * @Author: ldl
 * @Date: 2019/10/31 9:44
 * @Version 1.0
 * @Des:  简单工厂类
 */
public class SimpleFactory {

    /**
     * 根据orderTyoe返回对应的对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("greek".equals(orderType)){
            pizza = new GreekPizza();
        }else if ("cheese".equals(orderType)){
            pizza = new CheesePizza();
        }

        return pizza;
    }

}
