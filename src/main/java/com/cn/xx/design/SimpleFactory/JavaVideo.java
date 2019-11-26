package com.cn.xx.design.SimpleFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/14 16:41
 * @Version 1.0
 * @Des: 具体产品类，继承抽象产品类
 */
public class JavaVideo extends SimpleFactory {
    @Override
    public void produce() {
        System.out.println("java天下第一");
    }
}
