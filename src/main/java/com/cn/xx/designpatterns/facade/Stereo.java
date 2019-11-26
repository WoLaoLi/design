package com.cn.xx.designpatterns.facade;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class Stereo {

    private static Stereo instance = new Stereo();


    public static Stereo getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("Stereo 开");
    }

    public void of(){
        System.out.println("Stereo off");
    }

    public void up(){
        System.out.println("Stereo up");
    }

}
