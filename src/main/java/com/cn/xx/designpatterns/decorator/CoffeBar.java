package com.cn.xx.designpatterns.decorator;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/11
 * @description :
 */
public class CoffeBar {


    public static void main(String[] args) {
        //装饰着下订单


        //1 点一分 LongBlack
        Drink order = new LongBlack();
        System.out.println("费用=1" + order.getPrice());
        System.out.println("描述=" + order.getDes());


        //2 加入一份牛奶
        order = new Milk(order);
        System.out.println("加入牛奶后费用=1" + order.getPrice());
        System.out.println("加入牛奶后描述=" + order.getDes());

        //3加入一份巧克力
        order = new Chocolate(order);
        System.out.println("加入牛奶又加入巧克力后费用=1" + order.getPrice());
        System.out.println("加入牛奶后有加入巧克力描述=" + order.getDes());

        //3加入一份巧克力
        order = new Chocolate(order);
        System.out.println("加入牛奶又加入巧克力后费用=1" + order.getPrice());
        System.out.println("加入牛奶后有加入巧克力描述=" + order.getDes());



        //无印咖啡
        System.out.println("====================");

        Drink order2 = new DeCaf();

        System.out.println("费用=2" + order2.getPrice());
        System.out.println("描述=" + order2.getDes());


        order2 = new Milk(order2);
        System.out.println("加入牛奶后费用=1" + order2.getPrice());
        System.out.println("加入牛奶后描述=" + order2.getDes());

    }

}
