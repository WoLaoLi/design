package com.cn.xx.designpatterns.command;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/18
 * @description :
 */
public class RemoteController {

    /**
     * 开按钮命令数组
     */
    Command[] onCommands;
    Command[] offCommands;

    /**
     * 撤销命令
     *
     */
    Command undoCommand;


    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i =0;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }


    /**
     * 给按钮设置需要的命令
     */
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] =onCommand;
        offCommands[no] = offCommand;
    }


    /**
     * 按下开
     */
    public void onButtonWasPushed(int no){
        //找到按下开的按钮，并调用对应方法
        onCommands[no].excute();
        //记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }


    /**
     * 按下关
     */
    public void offButtonWasPushed(int no){
        //找到按下关的按钮，并调用对应方法
        offCommands[no].excute();
        //记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }


    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
