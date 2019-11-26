package com.cn.xx.designpatterns.builder.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/5
 * @description :
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼 打地基 100");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼 砌墙 20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼 屋顶");
    }
}
