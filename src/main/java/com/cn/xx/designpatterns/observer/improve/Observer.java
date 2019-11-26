package com.cn.xx.designpatterns.observer.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/20
 * @description : 观察者接口，有观察者来实现
 */
public interface Observer {


    void update(float temperature,float pressure,float humidity);

}
