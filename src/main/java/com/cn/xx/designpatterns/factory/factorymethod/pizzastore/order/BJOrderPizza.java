package com.cn.xx.designpatterns.factory.factorymethod.pizzastore.order;

import com.cn.xx.designpatterns.factory.factorymethod.pizzastore.pizza.BJChessPizza;
import com.cn.xx.designpatterns.factory.factorymethod.pizzastore.pizza.BJPepperPizza;

import com.cn.xx.designpatterns.factory.factorymethod.pizzastore.pizza.Pizza;


/**
 * @Author: ldl
 * @Date: 2019/10/31 14:19
 * @Version 1.0
 * @Des:
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJChessPizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
