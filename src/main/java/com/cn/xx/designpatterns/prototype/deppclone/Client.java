package com.cn.xx.designpatterns.prototype.deppclone;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/4
 * @description :
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("松江");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("大牛","大牛的类"));


        //方式1 深拷贝
//        DeepProtoType clone = (DeepProtoType)deepProtoType.clone();
//
//        System.out.println(deepProtoType.getName()+":"+deepProtoType.getDeepCloneableTarget().hashCode());
//        System.out.println(clone.getName()+":"+clone.getDeepCloneableTarget().hashCode());


        //方式2 完成深拷贝
        DeepProtoType clone = (DeepProtoType)deepProtoType.deepClone();

        System.out.println(deepProtoType.getName()+":"+deepProtoType.getDeepCloneableTarget().hashCode());
        System.out.println(clone.getName()+":"+clone.getDeepCloneableTarget().hashCode());

    }

}
