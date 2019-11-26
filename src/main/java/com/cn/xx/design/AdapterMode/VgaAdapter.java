package com.cn.xx.design.AdapterMode;

/**
 * @Author: ldl
 * @Date: 2019/10/23 10:16
 * @Version 1.0
 * @Des:
 */
public class VgaAdapter extends Adapter {

    @Override
    public void typec() {
        System.out.println("信息从Typec口的手机输出。");
    }

    @Override
    public void typec2vga() {
        System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}
