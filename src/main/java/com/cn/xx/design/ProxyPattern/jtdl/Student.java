package com.cn.xx.design.ProxyPattern.jtdl;

/**
 * @Author: ldl
 * @Date: 2019/10/23 14:19
 * @Version 1.0
 * @Des: 实现Teacher接口。Student可以具体实施上交班费的动作
 */
public class Student implements Teacher {

    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name+"上交班费100");
    }
}
