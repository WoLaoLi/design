package com.cn.xx.designpatterns.command;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/18
 * @description :
 */
public class LightOnCommand implements Command {

    /**
     * 聚合LightReceiver
     */
    LightReceiver lightReceiver;


    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        //调用接受者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
