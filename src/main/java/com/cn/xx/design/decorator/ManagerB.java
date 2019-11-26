package com.cn.xx.design.decorator;

/**
 * @Author: ldl
 * @Date: 2019/10/23 13:50
 * @Version 1.0
 * @Des:
 */
public class ManagerB extends Manager {

    public ManagerB(Person person){
        this.person = person;
    }

    @Override
    public void doCoding() {
        super.doCoding();
        doEnd();
    }

    private void doEnd(){
        System.out.println("项目经理B处理后期事项");
    }
}
