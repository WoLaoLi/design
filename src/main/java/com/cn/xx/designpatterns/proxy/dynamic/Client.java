package com.cn.xx.designpatterns.proxy.dynamic;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/14
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();

        //给目标对象创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();

        System.out.println(proxyInstance);
        //class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println(proxyInstance.getClass());

        //通过代理对象调用目标对象方法
//        proxyInstance.teach();

        proxyInstance.sayHello("hello");
    }

}
