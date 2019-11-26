package com.cn.xx.designpatterns.proxy.dynamic;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/14
 * @description :
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello "+name);
    }
}
