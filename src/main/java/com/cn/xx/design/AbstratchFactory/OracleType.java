package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:42
 * @Version 1.0
 * @Des:
 */
public class OracleType implements IType {
    @Override
    public void insert(Type type) {
        System.out.println("oracle增加type");
    }

    @Override
    public Type getType(int id) {
        System.out.println("oracle查询type");
        return null;
    }
}
