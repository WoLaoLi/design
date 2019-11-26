package com.cn.xx.designpatterns.flyweight;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class ConcreteWbSite extends WebSite {

    /**
     * 网站发布形式  共享部分  内部状态
     */
    private String type = "";


    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+"使用者="+user.getName());
    }

    public ConcreteWbSite(String type) {
        this.type = type;
    }
}
