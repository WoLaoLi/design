package com.cn.xx.designpatterns.facade;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class Projecter {

    private static Projecter instance = new Projecter();


    public static Projecter getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("Projecter 开");
    }

    public void off(){
        System.out.println("Projecter off");
    }

    public void focus(){
        System.out.println("Projecter focus ");
    }


}
