package com.cn.xx.designpatterns.facade;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class Screen {

    private static Screen instance = new Screen();


    public static Screen getInstance(){
        return instance;
    }


    public void up(){
        System.out.println("Screen 开");
    }

    public void down(){
        System.out.println("Screen off");
    }



}
