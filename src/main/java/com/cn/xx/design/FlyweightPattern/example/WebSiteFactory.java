package com.cn.xx.design.FlyweightPattern.example;

import java.util.HashMap;

/**
 * @Author: ldl
 * @Date: 2019/10/15 17:04
 * @Version 1.0
 * @Des: 网络工厂类
 *
 */
public class WebSiteFactory {

    private HashMap<String,ConcreteWbSite> pool = new HashMap<>();

    //获得网站分类
    public Website getWebSiteCategory(String key){
        if (!pool.containsKey(key)){
            pool.put(key,new ConcreteWbSite(key));
        }
        return pool.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount(){
        return pool.size();
    }

}
