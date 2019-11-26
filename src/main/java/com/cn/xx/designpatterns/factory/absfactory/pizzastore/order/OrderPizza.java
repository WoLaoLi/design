package com.cn.xx.designpatterns.factory.absfactory.pizzastore.order;

import com.cn.xx.designpatterns.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: ldl
 * @Date: 2019/11/1 13:49
 * @Version 1.0
 * @Des:
 */
public class OrderPizza {

    AbsFactory factory;

    public  OrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType ="";
        this.factory = factory;

        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bos();
            }else{
                System.out.println("订购失败");
                break;
            }

        }while (true);
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
