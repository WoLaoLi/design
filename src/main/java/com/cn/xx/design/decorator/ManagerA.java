package com.cn.xx.design.decorator;

/**
 * @Author: ldl
 * @Date: 2019/10/23 13:48
 * @Version 1.0
 * @Des: 具体装饰器 指定该装饰器的装饰对象
 */
public class ManagerA extends Manager {

    public ManagerA (Person person){
        this.person = person;
    }

    @Override
    public void doCoding() {
        doEarly();
        super.doCoding();
    }

    private void doEarly(){
        System.out.println("项目经理A处理前期事项");
    }
}
