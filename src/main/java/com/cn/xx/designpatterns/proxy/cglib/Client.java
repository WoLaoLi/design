package com.cn.xx.designpatterns.proxy.cglib;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/14
 * @description :
 */
public class Client {


    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        //执行代理对象 触发intecept方法 从而实现对目标对象的调用
        String str = proxyInstance.tech();
        System.out.println(str);
    }

}
