package com.cn.xx.designpatterns.strategy.improve;

/**
 * @Author: ldl
 * @Date: 2019/11/26 16:12
 * @Version 1.0
 * @Des:
 */
public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        //动态改变某个对象的行为
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();

    }

}
