package com.cn.xx.designpatterns.memento.theory;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/24
 * @description :
 */
public class Originator {


    /**
     * 状态
     */
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    /**
     * 编写方法，保存一个状态对象memnto
     * 返回Memnto
     */
    public Memento saveStateMemento(){
        return new Memento(state);
    }


    /**
     * 通过备忘录对象，恢复状态
     */
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

}
