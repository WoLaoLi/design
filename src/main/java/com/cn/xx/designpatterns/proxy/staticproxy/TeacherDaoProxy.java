package com.cn.xx.designpatterns.proxy.staticproxy;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/14
 * @description : 代理对象  静态代理
 */
public class TeacherDaoProxy implements ITeacherDao {


    /**
     * 目标对象 通过接口来聚合
     */
    private ITeacherDao target;


    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }


    @Override
    public void tech() {
        System.out.println("代理对象开始代理");
        target.tech();
        System.out.println("提交");
    }
}
