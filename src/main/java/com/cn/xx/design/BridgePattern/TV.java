package com.cn.xx.design.BridgePattern;

/**
 * @Author: ldl
 * @Date: 2019/10/16 13:46
 * @Version 1.0
 * @Des: 首先抽象出电视机，提供遥控器改变的行为办法
 */
public abstract class TV {

    public  abstract  void on();
    public  abstract  void off();
    public  abstract  void tuneChannel();

}
