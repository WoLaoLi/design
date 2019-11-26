package com.cn.xx.designpatterns.flyweight;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/13
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //创建工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //新闻形式发布
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");

        webSite1.use(new User("yom"));


        //博客形式
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");

        webSite2.use(new User("jack"));

        //博客
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("新闻");

        webSite3.use(new User("sims"));

        System.out.println("网站的分类共="+webSiteFactory.getWebSiteCount());

    }

}
