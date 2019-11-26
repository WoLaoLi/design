package com.cn.xx.design.composite;

import javax.naming.Name;
import java.util.ArrayList;

/**
 * @Author: ldl
 * @Date: 2019/10/16 10:40
 * @Version 1.0
 * @Des:
 */
public class Composite extends Component {
    public Composite(String name) {
        super(name);
    }

    //构建容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    @Override
    public void add(Component component) {
        componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentArrayList.remove(component);
    }

    @Override
    public void display(int depth) {
        //输出树形结构
        for (int i =0;i<depth;i++){
            System.out.println("-");
        }
        System.out.println(name);
        //下级遍历
        for (Component component : componentArrayList) {
            component.display(depth+1);
        }

    }
}
