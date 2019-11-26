package com.cn.xx.design.AppearanceModel;

/**
 * @Author: ldl
 * @Date: 2019/10/23 11:23
 * @Version 1.0
 * @Des:  这样定义一个ModuleFacade类可以有效地屏蔽内部的细节，免得客户端去调用Module类时，发现一些不需要它知道的方法。比如a2()和a3()方法就不需要让客户端知道，否则既暴露了内部的细节，
 *        又让客户端迷惑。对客户端来说，他可能还要去思考a2()、a3()方法用来干什么呢？其实a2()和a3()方法是内部模块之间交互的，原本就不是对子系统外部的，所以干脆就不要让客户端知道。
 */
public class ModulFacade {

    ModuleA moduleA = new ModuleA();
    ModuleB moduleB = new ModuleB();
    ModuleC moduleC = new ModuleC();

    /**
     * 下面这些是A B C对子系统外部提供的方法
     */
    public void a1() {
        moduleA.a1();
    }

    public void b1() {
        moduleB.b1();
    }

    public void c1() {
        moduleC.c1();
    }


}
