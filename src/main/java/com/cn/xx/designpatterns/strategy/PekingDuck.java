package com.cn.xx.designpatterns.strategy;

/**
 * @Author: ldl
 * @Date: 2019/11/26 15:15
 * @Version 1.0
 * @Des:
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("北京鸭");
    }

    /**
     * 因为北京鸭不能飞 因此需要重写fly
     */
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞");
    }
}
