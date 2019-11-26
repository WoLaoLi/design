package com.cn.xx.designpatterns.command;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/18
 * @description : 没有任何命令，即空执行，用于初始化每个按钮  当调用空命令时，对象什么都不做
 *               这也是一中设计模式，可以省掉对空判断
 */
public class NoCommand implements Command {

    @Override
    public void excute() {

    }

    @Override
    public void undo() {

    }
}
