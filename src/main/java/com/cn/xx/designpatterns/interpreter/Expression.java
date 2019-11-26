package com.cn.xx.designpatterns.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式，通过HashMap 键值对 可以获取到各个变量值
 *
 * @author admin
 */

public abstract class Expression {


	/**
	 * 解释公式和数值 key/就是公式(表达式) value就是具体值
	 *
	 * {a=10,b=20}
	 * @param var
	 * @return
	 */
	public abstract int interpreter(HashMap<String, Integer> var);
}
