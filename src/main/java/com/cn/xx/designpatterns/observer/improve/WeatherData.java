package com.cn.xx.designpatterns.observer.improve;

import com.cn.xx.designpatterns.observer.CurrentConditions;

import java.util.ArrayList;
import java.util.List;

/**
 * ���Ǻ���
 * 1. �������µ����������Ϣ 
 * 2. ���� CurrentConditions ����
 * 3. �������и���ʱ���������ĵ���   CurrentConditions����update����(�� display), �������ǣ����뷽���Ϳ������µ���Ϣ
 * @author Administrator
 * 核心类
 *  包含最新的天气情况信息
 *  包含CurrentConditions 对象  含有观察者集合
 *  当数据有更新时，通知所有接入方
 */
public class WeatherData implements Subject {
	private float temperatrue;
	private float pressure;
	private float humidity;
	private List<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		//调用接入方的update方法
//		currentConditions.update(getTemperature(), getPressure(), getHumidity());
		notifyObserver();
	}

	//当数据有更新时 就调用 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//将最新的信息推送给接入方
		dataChange();
	}

	/**
	 * 注册一个观察者
	 * @param o
	 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/**
	 * 移除一个观察者
	 * @param o
	 */
	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o)){
			observers.remove(o);
		}
	}

	/**
	 * 遍历所有观察者并通知
	 * @param o
	 */
	@Override
	public void notifyObserver() {
		observers.forEach(x -> {
			x.update(this.temperatrue,this.pressure,this.humidity);
		});
	}
}
