package com.cn.xx.designpatterns.adapter.objectAdapter;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/6
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("对象适配器");
        Phone phone = new Phone();
        phone.chaarging(new VoltageAdapter(new Voltage220V()));
    }


}
