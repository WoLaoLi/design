package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:37
 * @Version 1.0
 * @Des: IType接口，用于客户端访问，解除与具体数据库访问的耦合
 */
public interface IType {

    void insert(Type type);

    Type getType(int id);

}
