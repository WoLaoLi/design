package com.cn.xx.designpatterns.flyweight;

import java.util.HashMap;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description : 网站工厂类  根据需求返回一个网站
 */
public class WebSiteFactory {


    /**
     * 集合 充当池的作用
     */
    private HashMap<String,ConcreteWbSite> pool = new HashMap<>();


    /**
     * 根据类型 返回一个网站  如果没有就创建一个网站，并放入池中
     */
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreteWbSite(type));
        }

        return pool.get(type);
    }

    /**
     * 获取网站分类的总数 (池中有多少)
     */
    public int getWebSiteCount(){
        return pool.size();
    }


}
