package com.cn.xx.designpatterns.bride;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/10
 * @description :
 */
public class FlodedPhone extends Phone {


    public FlodedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("折叠手机 ");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机");
    }
}
