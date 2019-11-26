package com.cn.xx.designpatterns.builder;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/4
 * @description :
 */
public abstract class AbstractHouse {

    /**
     * 打地基
     */
    public abstract void buildeBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();


    /**
     * 封顶
     */
    public abstract void roofed();


    public void build(){
        buildeBasic();
        buildWalls();
        roofed();
    }

}
