package com.cn.xx.designpatterns.memento.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/24
 * @description : 守护者对象，保存游戏角色的状态
 */
public class Caretaker {

    /**
     * 如果只保存一次状态
     */
    private Memento memento;

    /**
     * 如果对GameRole保存多次状态
     *
     */
    private List<Memento> mementoList = new ArrayList<>();

    /**
     * 对多个游戏角色保存多个状态
     *
     */
    private Map<String,Memento> rolesMenemtos = new HashMap<>();


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public List<Memento> getMementoList() {
        return mementoList;
    }

    public void setMementoList(List<Memento> mementoList) {
        this.mementoList = mementoList;
    }

    public Map<String, Memento> getRolesMenemtos() {
        return rolesMenemtos;
    }

    public void setRolesMenemtos(Map<String, Memento> rolesMenemtos) {
        this.rolesMenemtos = rolesMenemtos;
    }
}
