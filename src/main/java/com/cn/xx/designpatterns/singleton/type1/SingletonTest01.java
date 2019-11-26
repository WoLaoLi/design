package com.cn.xx.designpatterns.singleton.type1;

/**
 * @Author: ldl
 * @Date: 2019/10/30 11:01
 * @Version 1.0
 * @Des:
 */
public class SingletonTest01 {

    public static void main(String[] args) {

    }


    /**
     * 饿汉式(静态变量)
     */
    static class Singleton{
        // 1 构造器私有化
        private Singleton(){

        }


        //2 本类内部创建一个对象实例
        private final static Singleton instance = new Singleton();
    }

}
