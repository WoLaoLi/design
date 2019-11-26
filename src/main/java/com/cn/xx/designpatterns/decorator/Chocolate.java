package com.cn.xx.designpatterns.decorator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/11
 * @description : 具体的装饰者
 */
public class Chocolate extends Decorator {


    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        //当前调味品的价格
        setPrice(3.0f);
    }


}
