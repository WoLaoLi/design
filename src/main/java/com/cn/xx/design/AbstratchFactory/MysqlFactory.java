package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:48
 * @Version 1.0
 * @Des: MySQLFactory类，实现IFactory接口，实例化MySQLUser和MySQLType。
 */
public class MysqlFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public IType createType() {
        return new MySqlType();
    }
}
