package com.cn.xx.designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/14
 * @description :
 */
public class ProxyFactory {

    /**
     * 维护一个目标对象，Object
     */
    private Object target;

    /**
     * 构件构造器 对target进行初始化
     *
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象 生成代理对象
     */
    public Object getProxyInstance() {
        //参数说明
        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         * // 1 ClassLoader loader 指定当前目标对象使用的类加载器 获取加载器的方法固定
         * 2 Class<?>[] interfaces 目标对象实现的接口类型，使用泛型方式确认类型
         * 3 InvocationHandler h 事件处理，执行目标对象的方法时，会去触发事件处理器的方法 会把当前执行的目标对象方法作为参数传入
         */
        //1 loader
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK代理开始");
                    //通过反射调用目标对象的方法
                    Object returnVal = method.invoke(target, args);
                    System.out.println("JDK代理提交");
                    return returnVal;
                });
    }
}
