package com.cn.xx.design.ProxyPattern.jtdl;

/**
 * @Author: ldl
 * @Date: 2019/10/23 14:24
 * @Version 1.0
 * @Des: 这个类也实现了teacher接口，由于实现了teacher接口，同时持有一个学生对象，那么他可以代理学生对象执行上交班费行为
 *       学生代理类，也实现了teacher接口，保存一个学生实体，这样就可以代理学生产生行为
 */
public class StudentProxy implements Teacher {

    /**
     * 被代理的学生
     */
    Student stu;

    public StudentProxy(Teacher stu){
        //只代理学生对象
        if (stu.getClass() == Student.class) {
            this.stu = (Student)stu;
        }
    }

    /**
     * 代理上交班费，调用被代理 学生的上交班费行为
     */
    @Override
    public void giveMoney() {
        System.out.println("张三家里是土豪，应该比其它人交更多的班费！");
        stu.giveMoney();
        System.out.println("张三班费交的最多，你就是班长了！");
    }
}
