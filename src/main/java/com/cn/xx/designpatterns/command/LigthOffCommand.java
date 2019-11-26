package com.cn.xx.designpatterns.command;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/18
 * @description :
 */
public class LigthOffCommand implements Command {


    /**
     * 聚合LightReceiver
     */
    LightReceiver lightReceiver;

    public LigthOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
