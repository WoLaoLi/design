package com.cn.xx.designpatterns.iterator;

import java.util.Iterator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/19
 * @description :
 */
public interface College {


    String getName();

    /**
     * 增加
     */
    void addDepartment(String name,String desc);

    /**
     * 返回一个迭代器
     * @return
     */
    Iterator createIterator();


}
