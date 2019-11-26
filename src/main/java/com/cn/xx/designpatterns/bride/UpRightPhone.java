package com.cn.xx.designpatterns.bride;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/10
 * @description :
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立式手机");
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立式手机");
    }
}
