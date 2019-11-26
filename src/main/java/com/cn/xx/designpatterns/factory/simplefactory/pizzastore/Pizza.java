package com.cn.xx.designpatterns.factory.simplefactory.pizzastore;

/**
 * @Author: ldl
 * @Date: 2019/10/30 16:24
 * @Version 1.0
 * @Des: 将Pizza做成抽象类
 */
public abstract class Pizza {

    protected String name;

    /**
     * 准备原材料，不同种类是不一样的，因此做成一个抽象方法
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name+" baking");
    }

    public void cut(){
        System.out.println(name+" cutting");
    }

    public void bos(){
        System.out.println(name+" boxing");
    }

    public void setName(String name){
        this.name = name;
    }

}
