package com.cn.xx.designpatterns.memento.theory;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/24
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setState("状态1");

        //保存当前状态
        caretaker.add(originator.saveStateMemento());


        originator.setState("状态2");
        caretaker.add(originator.saveStateMemento());


        originator.setState("状态3");
        caretaker.add(originator.saveStateMemento());


        System.out.println("当前状态：："+originator.getState());

        //得到状态1,将originater恢复状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态1："+originator.getState());


    }

}
