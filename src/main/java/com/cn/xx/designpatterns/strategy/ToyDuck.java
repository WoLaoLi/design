package com.cn.xx.designpatterns.strategy;

/**
 * @Author: ldl
 * @Date: 2019/11/26 15:17
 * @Version 1.0
 * @Des:
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    /**
     * 需要重写父类所有方法
     */

    @Override
    public void quack(){
        System.out.println("玩具不能叫");
    }

    @Override
    public void swim(){
        System.out.println("玩具鸭子不游泳");
    }

    @Override
    public void fly(){
        System.out.println("玩具鸭子不飞行");
    }
}
