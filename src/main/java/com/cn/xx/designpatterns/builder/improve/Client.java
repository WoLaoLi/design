package com.cn.xx.designpatterns.builder.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/5
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成 返回产品
        House house = houseDirector.constructHouse();


        System.out.println("------------------------------- ");

        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成盖房
        House house1 = houseDirector.constructHouse();

    }

}
