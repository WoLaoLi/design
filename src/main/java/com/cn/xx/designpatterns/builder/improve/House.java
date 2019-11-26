package com.cn.xx.designpatterns.builder.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/5
 * @description : 产品
 */
public class House {

    private String baise;
    private String wall;
    private String roofed;


    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
