package com.cn.xx.design.FlyweightPattern;

/**
 * @Author: ldl
 * @Date: 2019/10/15 15:35
 * @Version 1.0
 * @Des: 不需要共享的Flyweight
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight："+extrinsic);
    }
}
