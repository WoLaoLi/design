package com.cn.xx.designpatterns.command;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/18
 * @description : 创建命令接口
 */
public interface Command {


    /**
     * 执行某个操作
     */
    void excute();

    /**
     * 撤某个操作
     *
     */
    void undo();

}
