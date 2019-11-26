package com.cn.xx.designpatterns.builder;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/4
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        AbstractHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }

}
