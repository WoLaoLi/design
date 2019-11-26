package com.cn.xx.design.ProxyPattern.jtdl;

/**
 * @Author: ldl
 * @Date: 2019/10/23 14:31
 * @Version 1.0
 * @Des: 这里并没有直接通过张三（被代理对象）来执行上交班费的行为，而是通过班长（代理对象）来代理执行了。这就是代理模式。代理模式最主要的就是有一个公共接口（Teacher），一个具体的类（Student），
 *
 * 一个代理类（StudentsProxy）,代理类持有具体类的实例，代为执行具体类实例方法。 同时可以看到，代理类里除了实现目标类的方法，而且可以在执行前后添加其它方法来起到增强功能。这不就是AOP（面向切面
 *
 * 思想），对的AOP的实现就是基于代理模式，只不过它采用的是动态代理模式。
 */
public class ProxyTest {

    public static void main(String[] args) {
        //被代理学生张三，他的班费上交由代理对象monitor（班长）完成
        Teacher zhangsan = new Student("张三");

        //生成代理对象，并将张三传给代理对象
        Teacher monitor = new StudentProxy(zhangsan);

        //班长代理上交班费
        monitor.giveMoney();
    }

}
