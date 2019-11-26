package com.cn.xx.designpatterns.strategy;

/**
 * @Author: ldl
 * @Date: 2019/11/26 15:07
 * @Version 1.0
 * @Des:
 */
public abstract class Duck {


    public Duck() {

    }

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim(){
        System.out.println("鸭子游泳");
    }

    public void fly(){
        System.out.println("鸭子飞行");
    }
}
