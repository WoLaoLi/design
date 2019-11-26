package com.cn.xx.designpatterns.interpreter;

import java.util.HashMap;

/**
 * 抽象运算符号解析器 这里，每个运算符号都只和自己左右两个数字有关系，
 *  * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
 * @author Administrator
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * SymbolExpression 因为是让其子类实现，因此 interpreter是一个默认实现
	 * @param var
	 * @return
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
