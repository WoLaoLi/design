package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:38
 * @Version 1.0
 * @Des: 用于访问MySQL的user表
 */
public class MySqlUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("mysql插入user");
    }

    @Override
    public User getUser(int id) {
        System.out.println("mysql根据id查询");
        return null;
    }
}
