package com.cn.xx.design.FactoryMethod;

/**
 * @Author: ldl
 * @Date: 2019/10/14 17:40
 * @Version 1.0
 * @Des: 创建具体产品类 继承抽象产品类 定义生成的具体产品
 */
public class ProductA extends Product {
    @Override
    public void show() {
        System.out.println("生产出了产品A");
    }
}
