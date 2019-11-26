package com.cn.xx.designpatterns.adapter.interfaceAdapter;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/6
 * @description : 接口适配器
 */
public class Client {

    public static void main(String[] args) {
        //只需要覆盖使用的方法
        IAbsAdaper iAbsAdaper = new IAbsAdaper() {
            @Override
            public void m1() {
                System.out.println("使用m1");
            }
        };

        iAbsAdaper.m1();

        
    }

}
