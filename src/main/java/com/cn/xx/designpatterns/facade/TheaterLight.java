package com.cn.xx.designpatterns.facade;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();


    public static TheaterLight getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("TheaterLight 开");
    }

    public void of(){
        System.out.println("TheaterLight off");
    }

    public void dim(){
        System.out.println("TheaterLight dim");
    }


    public void birght(){
        System.out.println("TheaterLight birght");
    }

}
