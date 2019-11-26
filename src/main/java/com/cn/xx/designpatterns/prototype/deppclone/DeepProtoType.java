package com.cn.xx.designpatterns.prototype.deppclone;

import java.io.*;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/4
 * @description :
 */
public class DeepProtoType implements Serializable,Cloneable {

    private String name;
    /**
     * 引用类型
     */
    private DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public DeepProtoType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }


    /**
     * 完成深拷贝 方式1 使用clone
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型和字符串的克隆
        deep = super.clone();
        //对引用类型的属性进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();


        return deepProtoType;
    }

    /**
     * 深拷贝 方式2 通过对象的序列化实现(推荐)
     */
    public Object deepClone(){

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            ///序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
