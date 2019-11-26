package com.cn.xx.designpatterns.command;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/18
 * @description :
 */
public class TVOffCommand implements Command {


    /**
     * 聚合LightReceiver
     */
    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void excute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
