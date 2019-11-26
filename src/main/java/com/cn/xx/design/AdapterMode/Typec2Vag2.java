package com.cn.xx.design.AdapterMode;

/**
 * @Author: ldl
 * @Date: 2019/10/23 10:05
 * @Version 1.0
 * @Des: 对象的适配器模式
 *       原理：通过组合方式
 *
 *       实现一个Type-c转vga适配器  适配器第二种实现方式
 */
public class Typec2Vag2 implements Vga {

    private Phone phone;

    public Typec2Vag2(Phone phone){
        this.phone = phone;
    }

    @Override
    public void vgaInterface() {
        if (phone != null){
            phone.typecPhone();
            System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
            System.out.println("信息已转换成VGA接口，显示屏可以对接。");
        }
    }
}
