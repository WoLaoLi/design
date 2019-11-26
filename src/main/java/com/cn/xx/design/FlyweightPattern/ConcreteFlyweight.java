package com.cn.xx.design.FlyweightPattern;

/**
 * @Author: ldl
 * @Date: 2019/10/15 15:28
 * @Version 1.0
 * @Des: 继承Flyweight超类或实现Flyweight接口，并未其内部状态增加存储空间
 */
public class ConcreteFlyweight extends Flyweight {

    //接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    /**
     * 根据外部状态进行逻辑处理
     * @param extrinsic
     */
    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight"+extrinsic);
    }
}
