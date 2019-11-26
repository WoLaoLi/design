package com.cn.xx.designpatterns.proxy.staticproxy;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/14
 * @description :
 */
public class TeacherDao implements ITeacherDao {



    @Override
    public void tech() {
        System.out.println("老师正在授课。。。。。。。。。");
    }
}
