package com.cn.xx.design.composite;

/**
 * @Author: ldl
 * @Date: 2019/10/16 10:48
 * @Version 1.0
 * @Des:
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        //空实现，抛出“不支持请求”异常
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        //空实现，抛出“不支持请求”异常
        throw new UnsupportedOperationException();
    }

    @Override
    public void display(int depth) {
        //输出树形结构的叶子节点
           for(int i=0; i<depth; i++) {
                       System.out.print('-');
               }
              System.out.println(name);
    }
}
