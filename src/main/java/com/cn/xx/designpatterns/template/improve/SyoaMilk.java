package com.cn.xx.designpatterns.template.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/16
 * @description :
 */
public abstract class SyoaMilk {


    //模板方法 make  做成final  不让子类去覆盖
    final void make(){
        select();
        if (customerWantCondiments()){
            addCondinments();
        }
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步，选择好的材料");
    }

    //子类具体实现
    abstract void addCondinments();

    void soak(){
        System.out.println("第三步，浸泡");
    }

    void beat(){
        System.out.println("第四步，放入豆浆机");
    }

    //钩子方法，绝对是否需要添加配料
    boolean customerWantCondiments(){
        return true;
    }

}
