package com.cn.xx.designpatterns.factory.absfactory.pizzastore.order;

import com.cn.xx.designpatterns.factory.absfactory.pizzastore.pizza.*;

/**
 * @Author: ldl
 * @Date: 2019/11/1 13:47
 * @Version 1.0
 * @Des:
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDChessPizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
