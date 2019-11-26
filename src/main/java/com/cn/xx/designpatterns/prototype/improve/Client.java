package com.cn.xx.designpatterns.prototype.improve;


/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/4
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("使用原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");


        sheep.setFriend(new Sheep("jack",2,"黑色"));

        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println(sheep+":"+sheep2.getFriend().hashCode());
        System.out.println(sheep2+":"+sheep2.getFriend().hashCode());
        System.out.println(sheep3+":"+sheep2.getFriend().hashCode());
        System.out.println(sheep4+":"+sheep2.getFriend().hashCode());
        System.out.println(sheep5+":"+sheep2.getFriend().hashCode());
    }

}
