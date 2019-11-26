package com.cn.xx.designpatterns.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2019/11/24
 * @description :
 */
public class Caretaker {

    /**
     * 会有很多的备忘录对象
     */
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento){
        mementos.add(memento);
    }

    /**
     * 获取到第index哥Originator的备忘录对象(即保存状态)
     * @param index
     * @return
     */
    public Memento get(Integer index){
        return mementos.get(index);
    }

}
