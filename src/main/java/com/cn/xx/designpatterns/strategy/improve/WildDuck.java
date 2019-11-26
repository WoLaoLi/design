 package com.cn.xx.designpatterns.strategy.improve;

/**
 * @Author: ldl
 * @Date: 2019/11/26 15:15
 * @Version 1.0
 * @Des:
 */
public class WildDuck extends Duck {
    @Override
    public void display() {
        System.out.println("野鸭");
    }


    /**
     * 传入FlyBehavor
     */
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }
}
