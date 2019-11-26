package com.cn.xx.designpatterns.adapter.classAdapter;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/6
 * @description :
 */
public class Phone {


    /**
     * 充电
     */
    public void chaarging(Voltage5v v){
        if (v.outPut5v() == 5){
            System.out.println("电压5v充电");
        }else if(v.outPut5v()>5){
            System.out.println("大于5v 不充电");
        }
    }

}
