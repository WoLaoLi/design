package com.cn.xx.designpatterns.decorator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/11
 * @description :
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f );
    }
}
