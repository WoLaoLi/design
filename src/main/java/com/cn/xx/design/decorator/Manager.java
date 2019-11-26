package com.cn.xx.design.decorator;

/**
 * @Author: ldl
 * @Date: 2019/10/23 13:46
 * @Version 1.0
 * @Des: 抽象装饰器 指定一个装饰对象的引用
 */
public abstract class Manager implements Person{

    protected Person person;

    @Override
    public void doCoding(){
        person.doCoding();
    }

}
