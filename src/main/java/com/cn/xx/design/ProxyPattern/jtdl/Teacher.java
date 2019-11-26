package com.cn.xx.design.ProxyPattern.jtdl;

/**
 * @Author: ldl
 * @Date: 2019/10/23 14:17
 * @Version 1.0
 * @Des: 首先我们创建一个Teacher接口，这个接口就是学生（被代理类），和班长（代理类）的公共接口，他们都有上交班费的行为。这样，学生上交班费就可以让班长来代理执行
 */
public interface Teacher {

    /**
     * 上交班费
     */
    void giveMoney();

}
