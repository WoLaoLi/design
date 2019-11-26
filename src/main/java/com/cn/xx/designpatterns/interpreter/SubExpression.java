package com.cn.xx.designpatterns.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	/**
	 * 求出left 和right 表达式相减后的结果
	 * @param var
	 * @return
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
