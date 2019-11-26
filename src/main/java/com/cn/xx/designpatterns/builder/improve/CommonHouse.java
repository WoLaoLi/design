package com.cn.xx.designpatterns.builder.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/5
 * @description :
 */
public class CommonHouse extends HouseBuilder {


    @Override
    public void buildBasic() {
        System.out.println("普通 打地基 5");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通  砌墙 10");
    }

    @Override
    public void roofed() {
        System.out.println("普通 屋顶");
    }
}
