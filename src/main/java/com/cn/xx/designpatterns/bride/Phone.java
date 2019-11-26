package com.cn.xx.designpatterns.bride;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/10
 * @description :
 */
public abstract class Phone {

    private  Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }


    protected void open(){
        this.brand.open();
    }


    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
