package com.cn.xx.designpatterns.strategy.improve;

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

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }
}
