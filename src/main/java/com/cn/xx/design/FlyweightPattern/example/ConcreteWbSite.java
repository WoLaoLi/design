package com.cn.xx.design.FlyweightPattern.example;

import javax.sound.midi.Soundbank;

/**
 * @Author: ldl
 * @Date: 2019/10/15 16:44
 * @Version 1.0
 * @Des: 具体网站类
 */
public class ConcreteWbSite extends Website {

    private String name ="";

    public ConcreteWbSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类"+name+" "+user.getName());
    }
}
