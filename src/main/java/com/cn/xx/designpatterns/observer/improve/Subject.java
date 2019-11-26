package com.cn.xx.designpatterns.observer.improve;


/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/20
 * @description : 接口 让WeatherData 来实现
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
