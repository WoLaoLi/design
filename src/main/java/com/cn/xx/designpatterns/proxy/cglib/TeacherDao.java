package com.cn.xx.designpatterns.proxy.cglib;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/14
 * @description :
 */
public class TeacherDao {

    public String tech(){
        System.out.println("老师授课中 cglib代理 不需要实现接口");
        return "hello";
    }



}
