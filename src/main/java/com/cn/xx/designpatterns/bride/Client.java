package com.cn.xx.designpatterns.bride;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/10
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //获取折叠式手机（样式加品牌）


        Phone flodedPhone = new FlodedPhone(new XiaoMi());

        flodedPhone.open();
        flodedPhone.call();
        flodedPhone.close();

        System.out.println("----------------------------------------");

        Phone flodedPhone2 = new FlodedPhone(new Vivo());

        flodedPhone2.open();
        flodedPhone2.call();
        flodedPhone2.close();


        System.out.println("=============================");

        UpRightPhone upRightPhone = new UpRightPhone(new XiaoMi());

        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
        System.out.println("==============================");
        UpRightPhone upRightPhone2 = new UpRightPhone(new Vivo());

        upRightPhone2.open();
        upRightPhone2.call();
        upRightPhone2.close();

    }

}
