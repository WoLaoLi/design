package com.cn.xx.designpatterns.decorator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/11
 * @description :
 */
public class Coffee extends Drink {



    @Override
    public float cost() {
        return super.getPrice();
    }



}
