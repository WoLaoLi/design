package com.cn.xx.designpatterns.builder.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/5
 * @description :  去动态指定制作流程 返回具体产品
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;


    /**
     * 1 构造器传入
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }



    public HouseDirector() {

    }



    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    /**
     * stter传入
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何处理建造房子的流程，交给指挥者
     */
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
