package com.cn.xx.designpatterns.composite;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/12
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent university = new University("清华大学","中国顶级大学");

        OrganizationComponent collage = new Collage("计算机学院","计算机学院");
        OrganizationComponent collage2 = new Collage("信息工程学院","信息工程学院");

        collage.add(new Department("软件工程","软件工程"));
        collage.add(new Department("网络工程","软件工程"));
        collage.add(new Department("计算机科学与技术","计算机科学与技术"));

        collage2.add(new Department("通信工程","通信工程"));
        collage2.add(new Department("信息工程","信息工程"));


        university.add(collage);
        university.add(collage2);


        university.print();
    }

}
