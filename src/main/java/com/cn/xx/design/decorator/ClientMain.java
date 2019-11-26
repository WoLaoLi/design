package com.cn.xx.design.decorator;

/**
 * @Author: ldl
 * @Date: 2019/10/23 13:51
 * @Version 1.0
 * @Des:
 */
public class ClientMain {

    public static void main(String[] args) {
        Person employee = new Employee();
        employee  = new ManagerA(employee);
        employee  = new ManagerB(employee);
        employee.doCoding();
    }

}
