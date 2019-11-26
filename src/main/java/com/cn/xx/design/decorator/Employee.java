package com.cn.xx.design.decorator;

/**
 * @Author: ldl
 * @Date: 2019/10/23 13:45
 * @Version 1.0
 * @Des: 被装饰对象及其基本方法
 */
public class Employee implements Person {


    @Override
    public void doCoding() {
        System.out.println("程序员实现功能需求");
    }
}
