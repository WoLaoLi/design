package com.cn.xx.design.AppearanceModel;

/**
 * @Author: ldl
 * @Date: 2019/10/23 11:01
 * @Version 1.0
 * @Des: 子系统中的角色类
 *
 */
public class ModuleA {

    /**
     * 示意方法
     */
    /*public void testA(){
        System.out.println("调用moduleA中的tesA方法");
    }*/

    /**
     * 供系统外部使用的方法
     */
    public void a1(){
        System.out.println("系统外部使用的方法");
    }

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    public void a2(){
        System.out.println("子系统内部模块之间相互调用使用的方法");
    }
    public void a3(){
        System.out.println("子系统内部模块之间相互调用使用的方法");
    }

}
