package com.cn.xx.designpatterns.template.improve;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/16
 * @description :
 */
public class PureSoyaMilk extends SyoaMilk {
    @Override
    void addCondinments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
