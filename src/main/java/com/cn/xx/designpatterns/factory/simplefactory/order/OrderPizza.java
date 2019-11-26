package com.cn.xx.designpatterns.factory.simplefactory.order;

import com.cn.xx.designpatterns.factory.simplefactory.pizzastore.CheesePizza;
import com.cn.xx.designpatterns.factory.simplefactory.pizzastore.GreekPizza;
import com.cn.xx.designpatterns.factory.simplefactory.pizzastore.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: ldl
 * @Date: 2019/10/30 16:30
 * @Version 1.0
 * @Des:
 */
public class OrderPizza {

    /*public OrderPizza() throws IOException {
        Pizza pizza = null;
        //订购类型
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
            }else if (orderType.equals("cheese")){
                pizza = new CheesePizza();
            }else{
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bos();
        }while (true);
    }*/

    public OrderPizza(SimpleFactory simpleFactory) throws IOException {
        setFactory(simpleFactory);
    }

    /**
     * 定义一个简单工厂对象
     */
    SimpleFactory simpleFactory;
     Pizza pizza = null;
    public void setFactory(SimpleFactory simpleFactory) throws IOException {
        //用户提供类型
        String orderType = "";
        //设置简单工厂对象
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bos();
            }else{
                System.out.println("失败");
                break;
            }
        }while (true);
    }

    /**
     * 动态获取用户希望订购的
     */
    private String getType() throws IOException {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type");
        String str = strin.readLine();
        return str;
    }

}
