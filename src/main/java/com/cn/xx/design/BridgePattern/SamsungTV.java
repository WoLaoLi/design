package com.cn.xx.design.BridgePattern;


import java.io.Console;

/**
 * @Author: ldl
 * @Date: 2019/10/16 13:51
 * @Version 1.0
 * @Des: 创建具体的电视机，继承自抽象电视机类
 */
public class SamsungTV  extends TV{


    @Override
    public void on() {
        System.out.println("三星开");
    }

    @Override
    public void off() {
        System.out.println("三星关");
    }

    @Override
    public void tuneChannel() {
        System.out.println("三星换");
    }
}


