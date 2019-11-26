package com.cn.xx.designpatterns.bride;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/10
 * @description :
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo 开机");
    }

    @Override
    public void close() {
        System.out.println("vivo 关机");

    }

    @Override
    public void call() {
        System.out.println("vivo打电话");

    }
}
