package com.cn.xx.designpatterns.composite;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/12
 * @description :
 */
public class Department extends OrganizationComponent {


    public Department(String name, String des) {
        super(name, des);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }


    @Override
    protected void print() {
        System.out.println(getName());

    }

}
