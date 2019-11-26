package com.cn.xx.design.composite;

/**
 * @Author: ldl
 * @Date: 2019/10/16 10:25
 * @Version 1.0
 * @Des:
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    //增加一个叶子构件或树枝构件
    public abstract void add(Component component);

    //删除一个叶子构件或树枝构件
    public abstract void remove(Component component);

    //获取分支下的所有叶子构件和树枝构件
    public abstract void display(int depth);

}
