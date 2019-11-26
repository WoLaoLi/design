package com.cn.xx.designpatterns.factory.factorymethod.pizzastore.order;

import com.cn.xx.designpatterns.factory.factorymethod.pizzastore.pizza.Pizza;
import com.cn.xx.designpatterns.factory.simplefactory.order.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: ldl
 * @Date: 2019/10/30 16:30
 * @Version 1.0
 * @Des:
 */
public abstract class OrderPizza {


    /**
     * 定义一个抽象方法 createPizza 让各个工厂子类自己实现
     */
    abstract Pizza createPizza(String orderType);

    public OrderPizza()  {
        Pizza pizza = null;
        //订购类型
        String orderType;
        do {
            orderType = getType();
            //抽象方法 由工厂子类完成
            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bos();
        } while (true);
    }

    /**
     * 动态获取用户希望订购的
     */
    private String getType()  {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type");
        try {
            String str = strin.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }

}
