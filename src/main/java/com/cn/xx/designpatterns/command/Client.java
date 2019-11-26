package com.cn.xx.designpatterns.command;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/18
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器对点灯的操作

        //创建接收者
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LigthOffCommand ligthOffCommand = new LigthOffCommand(lightReceiver);


        //需要一个遥控器
        RemoteController remoteController = new RemoteController();


        //给遥控器设置相关命令  比如 no=0是电灯的开和关
        remoteController.setCommand(0,lightOnCommand,ligthOffCommand);

        System.out.println("-----------------按下开按钮---------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----------------按下关按钮---------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----------------按下撤销按钮---------------");
        remoteController.undoButtonWasPushed();


        System.out.println("操作电视机---------------------");
        //创建接收者
        TVReceiver tvReceiver = new TVReceiver();

        //创建电灯相关的开关命令
         TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        System.out.println("-----------------按下开按钮---------------");
        remoteController.onButtonWasPushed(1);
        System.out.println("-----------------按下关按钮---------------");
        remoteController.offButtonWasPushed(1);
        System.out.println("-----------------按下撤销按钮---------------");
        remoteController.undoButtonWasPushed();

    }

}
