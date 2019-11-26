package com.cn.xx.designpatterns.adapter.objectAdapter;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/6
 * @description : 对象适配器
 */
public class VoltageAdapter implements Voltage5v {


    private Voltage220V v;

    /**
     * 通过构造器传入实例   聚合 聚合优于继承
     * @param v
     */
    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int outPut5v() {
        int dst = 0;
        if (v != null){
            //获取220
            int src = v.outPut220v();
            System.out.println("使用对象适配器");
            dst = src/44;
            System.out.println("适配完成："+dst);
        }
        return dst;
    }
}
