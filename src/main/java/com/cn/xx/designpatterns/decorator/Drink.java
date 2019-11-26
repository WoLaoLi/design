package com.cn.xx.designpatterns.decorator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/11
 * @description :
 */
public abstract class Drink {


    public String des;

    private float price = 0.0f;


    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    /**
     * 计算费用
     * 子类来实现
     * @return
     */
    public abstract  float cost();
}
