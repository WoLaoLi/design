package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:49
 * @Version 1.0
 * @Des: OracleFactory类，实现IFactory接口，实例化OracleUser和OralceType。
 */
public class OracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IType createType() {
        return new OracleType();
    }
}
