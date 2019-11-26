package com.cn.xx.designpatterns.strategy.improve;

/**
 * @Author: ldl
 * @Date: 2019/11/26 15:55
 * @Version 1.0
 * @Des:
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的一般");
    }
}
