package com.cn.xx.designpatterns.memento.theory;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/24
 * @description :
 */
public class Memento {


    private String state;

    public Memento(String state) {
        this.state = state;
    }


    public String getState() {
        return state;
    }
}
