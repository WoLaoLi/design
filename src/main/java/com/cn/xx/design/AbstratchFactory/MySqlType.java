package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:41
 * @Version 1.0
 * @Des:
 */
public class MySqlType implements IType {

    @Override
    public void insert(Type type) {
        System.out.println("mysql增加type");
    }

    @Override
    public Type getType(int id) {
        System.out.println("mysql查询type");
        return null;
    }
}
