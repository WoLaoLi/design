package com.cn.xx.design.composite;

/**
 * @Author: ldl
 * @Date: 2019/10/16 10:53
 * @Version 1.0
 * @Des:
 */
public class Client {

    public static void main(String[] args) {
        //创建根节点及其子节点
        Composite root = new Composite("root");
        root.add(new Leaf("LeafA"));
        root.add(new Leaf("LeafB"));

        //创建二层节点及其子节点
        Composite branch = new Composite("Composite X");
        branch.add(new Leaf("Leaf XA"));
        branch.add(new Leaf("Leaf XB"));
        root.add(branch);


        //创建二层节点及其子节点
        Composite branch2 = new Composite("Composite XY");
        branch.add(new Leaf("Leaf XYA"));
        branch.add(new Leaf("Leaf XYB"));
        root.add(branch2);

        //创建二层节点
        root.add(new Leaf("LeafC"));

        //创建二层节点并删除
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        //打印
        root.display(1);

    }

}
