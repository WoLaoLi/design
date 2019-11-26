package com.cn.xx.designpatterns.facade;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class DVDPlayer {

    //使用单例模式 饿汉式
    private static DVDPlayer instance = new DVDPlayer();


    public static DVDPlayer getInstance(){
        return instance;
    }


    public void open(){
        System.out.println("DVD打开");
    }

    public void off(){
        System.out.println("DVD 关闭");
    }

    public void play(){
        System.out.println("DVD播放");
    }

    //........
    public void pause(){
        System.out.println("DVD 暂停");
    }


}
