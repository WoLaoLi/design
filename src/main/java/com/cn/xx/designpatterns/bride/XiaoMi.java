package com.cn.xx.designpatterns.bride;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/10
 * @description :
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");

    }

    @Override
    public void call() {
        System.out.println("小米打电话");

    }
}
