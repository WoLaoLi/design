package com.cn.xx.design.AppearanceModel;

/**
 * @Author: ldl
 * @Date: 2019/10/23 11:04
 * @Version 1.0
 * @Des:
 *        门面角色类
 *        Facade类其实相当于A、B、C模块的外观界面，有了这个Facade类，那么客户端就不需要亲自调用子系统中的A、B、C模块了，
 *        也不需要知道系统内部的实现细节，甚至都不需要知道A、B、C模块的存在，客户端只需要跟Facade类交互就好了，从而更好地实现了客户端和子系统中A、B、C模块的解耦，让客户端更容易地使用系统。
 */
public class Facade {

    /**
     * 示意方法 满足客户端需要的
     */
    /*public void test(){
        ModuleA moduleA = new ModuleA();
        moduleA.testA();

        ModuleB moduleB = new ModuleB();
        moduleB.testA();

        ModuleC moduleC = new ModuleC();
        moduleC.testA();
    }*/

}
