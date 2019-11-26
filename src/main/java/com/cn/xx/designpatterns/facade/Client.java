package com.cn.xx.designpatterns.facade;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //直接调用 很麻烦


        //做一个外观类
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();
        homeTheaterFacade.play();

        homeTheaterFacade.end();
    }

}
