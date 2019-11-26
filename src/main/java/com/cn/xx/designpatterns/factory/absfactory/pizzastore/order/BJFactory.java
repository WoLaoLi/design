package com.cn.xx.designpatterns.factory.absfactory.pizzastore.order;

import com.cn.xx.designpatterns.factory.absfactory.pizzastore.pizza.BJChessPizza;
import com.cn.xx.designpatterns.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.cn.xx.designpatterns.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author: ldl
 * @Date: 2019/11/1 13:46
 * @Version 1.0
 * @Des:  这是一个工厂子类
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJChessPizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
