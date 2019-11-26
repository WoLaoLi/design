package com.cn.xx.designpatterns.facade;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class PopCorn {

    private static PopCorn instance = new PopCorn();


    public static PopCorn getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("爆米花 开");
    }

    public void off(){
        System.out.println("PopCorn off");
    }

    public void pop(){
        System.out.println("PopCorn pop");
    }


}
