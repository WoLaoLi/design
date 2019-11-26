package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:36
 * @Version 1.0
 * @Des:  IUser接口，用于客户端访问，接触与具体数据库的耦合
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);

}
