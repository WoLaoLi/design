package com.cn.xx.design.FlyweightPattern;

/**
 * @Author: ldl
 * @Date: 2019/10/15 16:12
 * @Version 1.0
 * @Des:  从这个结果我们可以看出来，第一次创建X、Y、Z时，都是先创建再从池中取出，而第二次创建X时，因为池中已经存在了，所以直接从池中取出，这就是享元模式。
 */
public class Client {

    public static void main(String[] args) {

        int extrinsic = 22;

        Flyweight x = FlyweightFactory.getFlyweight("X");
        x.operate(++extrinsic);

        Flyweight Y = FlyweightFactory.getFlyweight("Y");
        Y.operate(++extrinsic);

        Flyweight z  = FlyweightFactory.getFlyweight("Z");
        z.operate(++extrinsic);

        Flyweight x2 = FlyweightFactory.getFlyweight("X");
        x2.operate(++extrinsic);

        UnsharedConcreteFlyweight x1 = new UnsharedConcreteFlyweight("X");
        x1.operate(++extrinsic);


    }

}
