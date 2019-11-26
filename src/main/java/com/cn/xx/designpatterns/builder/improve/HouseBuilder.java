package com.cn.xx.designpatterns.builder.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/5
 * @description : 抽象的建造者
 */
public abstract class HouseBuilder {


    protected  House house = new House();

    //将建造的流程写好，抽象的方法

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();


    /**
     * 建造房子好后返回
     * @return
     */
    public House buildHouse(){
        return house;
    }

}
