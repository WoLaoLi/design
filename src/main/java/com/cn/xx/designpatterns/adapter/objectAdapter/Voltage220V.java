package com.cn.xx.designpatterns.adapter.objectAdapter;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/6
 * @description : 被适配器类
 */
public class Voltage220V {

    public int outPut220v(){
        int src = 220;
        System.out.println("电塔:"+src);
        return src;
    }

}
