package com.cn.xx.designpatterns.singleton.meiju;

/**
 * @Author: ldl
 * @Date: 2019/10/30 13:51
 * @Version 1.0
 * @Des:  枚举方式实现单例
 */
public class SingleTonTest {

    public static void main(String[] args) {
        SingleTon instance = SingleTon.INSTANCE;
        SingleTon instance1 = SingleTon.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

        instance.sayOk();
    }

}

/**
 * 使用枚举实现单例   避免多线程同步问题，而且还能防止反序列化重新创建对象
 */
enum SingleTon{
    //属性
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}

