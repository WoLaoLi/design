package com.cn.xx.design.FlyweightPattern.example;

/**
 * @Author: ldl
 * @Date: 2019/10/15 17:17
 * @Version 1.0
 * @Des: 客户端
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
                Website fx = factory.getWebSiteCategory("产品展示");
               fx.use(new User("admin"));
        Website fy = factory.getWebSiteCategory("产品展示");
                fy.use(new User("xxx"));

        Website fz = factory.getWebSiteCategory("产品展示");
                 fz.use(new User("laoli"));

        Website fa = factory.getWebSiteCategory("博客");
                 fa.use(new User("enen"));

        Website fb = factory.getWebSiteCategory("博客");
                 fb.use(new User("qwer"));

        Website fc = factory.getWebSiteCategory("博客");
                 fc.use(new User("azcxv"));

                 System.out.println("网站分类总数为：" + factory.getWebSiteCount());
    }

}
