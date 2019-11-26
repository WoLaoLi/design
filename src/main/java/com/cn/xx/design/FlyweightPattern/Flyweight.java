package com.cn.xx.design.FlyweightPattern;

/**
 * @Author: ldl
 * @Date: 2019/10/15 15:18
 * @Version 1.0
 * @Des: 所有享元类的超类或接口，通过这个接口。Flyweight可以接受并作用于外部状态
 */
public abstract class Flyweight {

    //内部状态
    private String intrinsic;
    //外部状态
    private final String extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
