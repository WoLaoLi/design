package com.cn.xx.design.AdapterMode;

/**
 * @Author: ldl
 * @Date: 2019/10/23 10:00
 * @Version 1.0
 * @Des: 实现一个Type-c转vga适配器
 *       适配器的实现有三种方式 类的适配器模式 对象的适配器模式 接口的适配器模式 这是第一种
 */
public class Typec2Vag1 extends Phone implements Vga {
    @Override
    public void vgaInterface() {
        typecPhone();
        System.out.println("接收到Type-c口信息，信息转成VGA接口中");
        System.out.println("信息已转为VGA接口，显示屏可以对接");
    }
}
