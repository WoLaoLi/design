package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:43
 * @Version 1.0
 * @Des: 定义一个访问User表对象和Type对象的抽象的工厂接口
 */
public interface IFactory {

    IUser createUser();
    IType createType();

}
