package com.cn.xx.designpatterns.memento.game;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/24
 * @description :
 */
public class Client {

    public static void main(String[] args) {
        //创建游戏结束
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);


        System.out.println("和boss干架前的状态");
        gameRole.display();


        //把当前状态保存到Caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战");

        gameRole.setDef(70);
        gameRole.setVit(70);

        gameRole.display();


        System.out.println("大战后 使用备忘录对象恢复");

       gameRole.recoverGameRoleFromMemento(caretaker.getMemento());

        System.out.println("恢复后的状态");

        gameRole.display();
    }

}
