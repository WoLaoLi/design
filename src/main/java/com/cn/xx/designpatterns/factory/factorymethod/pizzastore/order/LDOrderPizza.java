package com.cn.xx.designpatterns.factory.factorymethod.pizzastore.order;

import com.cn.xx.designpatterns.factory.factorymethod.pizzastore.pizza.*;


/**
 * @Author: ldl
 * @Date: 2019/10/31 14:19
 * @Version 1.0
 * @Des:
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDChessPizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
