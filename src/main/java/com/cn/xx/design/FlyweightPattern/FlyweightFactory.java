package com.cn.xx.design.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ldl
 * @Date: 2019/10/15 15:38
 * @Version 1.0
 * @Des:  一个享元工厂，用来创建管理Flyweight对象，主要是用来确保合理的共享Flyweight，当用户请求一个Flyweight，Flyweight对象提供一个已创建的实例或者创建一个实例
 */
public class FlyweightFactory {

    //定义一个池容器
    private static Map<String,Flyweight> pool = new HashMap<>();

    //享元工厂
    public static Flyweight getFlyweight(String extrinsic){
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)){
            flyweight = pool.get(extrinsic);
            System.out.println("已有 "+extrinsic+"直接从池中取");
        }else{
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight(extrinsic);
            //放入池中
            pool.put(extrinsic,flyweight);
            System.out.println("创建"+extrinsic+"并从池中取出");
        }
        return flyweight;
    }



}
