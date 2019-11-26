package com.cn.xx.designpatterns.iterator;

import java.util.Iterator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/19
 * @description :
 */
public class ComputerCollege implements College {


    Department[] departments;
    /**
     * 保存当前数组的对象个数
     */
    int numOfDepartment = 0;


    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java","java");
        addDepartment("php","php");
        addDepartment("大数据","大数据");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterattor(departments);
    }
}
