package com.cn.xx.designpatterns.responsibilitychian;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/26
 * @description : 请求类
 */
public class PurchaseRequest {


    /**
     * 请求类型
     */
    private int type = 0;



    private float price = 0.0f;

    private int id = 0;


    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }


    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }


}
