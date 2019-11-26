package com.cn.xx.designpatterns.observer.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/20
 * @description :
 */
public class CurrentConditions implements Observer {

    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，是由weatherData调用，我使用的推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
