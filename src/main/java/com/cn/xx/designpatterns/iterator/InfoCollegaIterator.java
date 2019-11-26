package com.cn.xx.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/19
 * @description :
 */
public class InfoCollegaIterator implements Iterator {


    /**
     * 集合方式存放的
     */
    List<Department> departments;

    /**
     * 索引
     */
    int index = -1;

    public InfoCollegaIterator(List<Department> departments) {
        this.departments = departments;
    }

    /**
     * 判断集合中有没有下一个
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index >= departments.size() -1){
            return false;
        }else{
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
