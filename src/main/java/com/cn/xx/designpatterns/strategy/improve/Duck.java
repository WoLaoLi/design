package com.cn.xx.designpatterns.strategy.improve;

/**
 * @Author: ldl
 * @Date: 2019/11/26 15:07
 * @Version 1.0
 * @Des:
 */
public abstract class Duck {


    /**
     * 聚合，策略接口
     */
    FlyBehavior flyBehavior;

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
       if (flyBehavior != null){
           flyBehavior.fly();
       }
    }



    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
