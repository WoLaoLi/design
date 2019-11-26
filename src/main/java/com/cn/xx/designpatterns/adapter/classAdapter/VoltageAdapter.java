package com.cn.xx.designpatterns.adapter.classAdapter;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/6
 * @description :  类适配器
 */
public class VoltageAdapter extends  Voltage220V implements Voltage5v{


    @Override
    public int outPut5v() {
        //获取到220v的电压
        int src = outPut220v();
        int dst = src/44;
        return dst;
    }
}
