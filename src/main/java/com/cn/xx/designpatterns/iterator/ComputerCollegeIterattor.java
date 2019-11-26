package com.cn.xx.designpatterns.iterator;

import java.util.Iterator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/19
 * @description :
 */
public class ComputerCollegeIterattor implements Iterator {

    //这里需要知道department是以怎样的方式存放的
    Department[] departments;
    /**
     * 遍历位置
     */
    int position = 0;


    public ComputerCollegeIterattor(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否有下一个
     * @return
     */
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position+=1;
        return department;
    }

    /**
     * 删除默认空实现
     */
    @Override
    public void remove() {

    }
}
