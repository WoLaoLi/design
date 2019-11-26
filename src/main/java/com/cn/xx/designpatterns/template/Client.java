package com.cn.xx.designpatterns.template;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/16
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //制作红豆
        System.out.println("制作红豆豆浆");
        SyoaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();


        //制作花生
        System.out.println("制作花生豆浆");
        SyoaMilk peanutSyoaMilk = new PeanutSyoaMilk();
        peanutSyoaMilk.make();
    }

}
