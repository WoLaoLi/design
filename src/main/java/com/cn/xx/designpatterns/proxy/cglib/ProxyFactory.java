package com.cn.xx.designpatterns.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/14
 * @description :
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 维护目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 实现对被代理对象方法的调用
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib代理模式开始");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib代理提交");
        return invoke;
    }

    /**
     * 返回一个代理对象(当前目标的代理对象)
     * @return
     */
    public Object getProxyInstance(){
        //1创建工具类
        Enhancer enhancer = new Enhancer();
        //2设置父类
        enhancer.setSuperclass(target.getClass());
        //3设置回调函数
        enhancer.setCallback(this);
        //4创建子类对象 即代理对象
        return enhancer.create();
    }
}
