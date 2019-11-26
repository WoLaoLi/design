package com.cn.xx.designpatterns.observer.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/20
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiDuSite baiDuSite = new BaiDuSite();

        //注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiDuSite);

        //测试
        System.out.println("通知各个注册的观察者，看信息");
        weatherData.setData(10,100,30);



    }

}
