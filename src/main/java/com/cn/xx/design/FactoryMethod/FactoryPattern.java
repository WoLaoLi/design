package com.cn.xx.design.FactoryMethod;

/**
 * @Author: ldl
 * @Date: 2019/10/14 17:47
 * @Version 1.0
 * @Des:
 */
public class FactoryPattern {


    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().show();


        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().show();
    }

}
