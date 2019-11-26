package com.cn.xx.designpatterns.decorator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/11
 * @description : 装饰着
 */
public class Decorator extends Drink{


    private Drink obj;

    @Override
    public float cost() {
        //getPrice 拿到自己的价格
        return super.getPrice() + obj.cost();
    }


    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDes() {
        // obj.geetDes  输出被装饰着的信息
        return super.getDes() + "" +super.getPrice() + "&&" + obj.getDes();
    }
}
