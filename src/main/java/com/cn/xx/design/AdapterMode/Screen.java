package com.cn.xx.design.AdapterMode;

/**
 * @Author: ldl
 * @Date: 2019/10/23 10:17
 * @Version 1.0
 * @Des:
 */
public class Screen {

    public static void main(String[] args) {

        //第一种适配器用法
        System.out.println("-------------第一种适配器------------");
        Vga vga = new Typec2Vag1();
        vga.vgaInterface();//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");

        //第二种适配器用法
        System.out.println("-------------第二种适配器------------");
        Typec2Vag2 typec2Vga1 = new Typec2Vag2(new Phone());
        typec2Vga1.vgaInterface();//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");

        //第三种适配器用法
        System.out.println("-------------第三种适配器------------");
        VgaAdapter vgaAdapter = new VgaAdapter();
        vgaAdapter.typec();
        vgaAdapter.typec2vga();//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");


    }

}
