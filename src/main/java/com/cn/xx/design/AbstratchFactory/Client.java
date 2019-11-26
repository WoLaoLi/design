package com.cn.xx.design.AbstratchFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/15 14:50
 * @Version 1.0
 * @Des:
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        Type type = new Type();

        IFactory mysqlFactory = new MysqlFactory();

        IFactory oracleFactory = new OracleFactory();

        IUser user1 = mysqlFactory.createUser();
        user1.insert(user);
        user1.getUser(1);
        IType type1 = mysqlFactory.createType();
        type1.insert(type);
        type1.getType(1);

        IType type2 = oracleFactory.createType();
        IUser user2 = oracleFactory.createUser();
        user2.insert(user);
        user2.getUser(1);
        type2.insert(type);
        type2.getType(1);
    }

}
