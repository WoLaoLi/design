package com.cn.xx.design.FactoryMethod;

/**
 * @Author: ldl
 * @Date: 2019/10/14 17:42
 * @Version 1.0
 * @Des: 创建具体工厂类  定义创建对应具体产品实例的方法
 */
public class FactoryB extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}
