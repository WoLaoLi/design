package com.cn.xx.designpatterns.command;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/18
 * @description :
 */
public class TVOnCommand implements Command {

    /**
     * 聚合LightReceiver
     */
    TVReceiver tvReceiver;


    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver ;
    }

    @Override
    public void excute() {
        //调用接受者的方法
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
