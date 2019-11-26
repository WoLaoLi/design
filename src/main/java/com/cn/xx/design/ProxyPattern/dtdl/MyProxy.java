package com.cn.xx.design.ProxyPattern.dtdl;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: ldl
 * @Date: 2019/10/23 14:41
 * @Version 1.0
 * @Des:   思考三个问题
 *      1）动态代理类是如何创建的？
 *      2) 它是如何调用MyProxy中的invoke的方法的？
 *      3)  MyProxy中invoke中的invoke方法又是啥含义？
 */
public class MyProxy {

    /**
     * 一个接口
     */
    public interface IHello{
        void sayHello();
    }

    /**
     * 目标类实现接口
     */
    static class Hello implements IHello{

        @Override
        public void sayHello() {
            System.out.println("sayHello........");
        }
    }

    /**
     * 自定义代理类需要实现InvocationHandler接口
     */
    static class HWInvocationHandler implements InvocationHandler{

        //目标对象
        private Object target;
        public HWInvocationHandler(Object target){
            this.target = target;
        }
        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            System.out.println("插入前置通知代码");
            //执行相应的目标方法
            Object invoke = method.invoke(target, objects);
            System.out.println("插入后置处理代码");
            return invoke;
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*//获取动态代理类
        Class<?> proxyClazz = Proxy.getProxyClass(IHello.class.getClassLoader(), new Class[]{IHello.class});
        //获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor<?> constructor = proxyClazz.getConstructor(InvocationHandler.class);
        //通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        IHello iHello = (IHello) constructor.newInstance(new HWInvocationHandler(new Hello()));
        //通过代理对象调用目标方法
        iHello.sayHello();*/

        IHello iHello = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),  //加载接口的类加载器
                new Class[]{IHello.class},  //一组接口
                new HWInvocationHandler(new Hello()));  //自定义的InvocationHandler
        iHello.sayHello();
    }

}
