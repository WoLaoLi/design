package com.cn.xx.design.AbstratchFactory;


/**
 * @Author: ldl
 * @Date: 2019/10/15 14:39
 * @Version 1.0
 * @Des:
 */
public class OracleUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("oracle插入user");
    }

    @Override
    public User getUser(int id) {
        System.out.println("oracle根据id查询");
        return null;
    }
}
