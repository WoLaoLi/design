package com.cn.xx.design.BridgePattern;

/**
 * @Author: ldl
 * @Date: 2019/10/16 13:54
 * @Version 1.0
 * @Des:
 */
public class ChangHongTV extends TV {
    @Override
    public void on() {
        System.out.println("长虹开");
    }

    @Override
    public void off() {
        System.out.println("长虹关");
    }

    @Override
    public void tuneChannel() {
        System.out.println("长虹换");
    }
}
