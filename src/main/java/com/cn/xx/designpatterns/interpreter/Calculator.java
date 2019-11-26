package com.cn.xx.designpatterns.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

	/**
	 * 定义表达式
	 */
	private Expression expression;

	/**
	 * 构造函数传参 并解析
	 * @param expStr
	 */
	public Calculator(String expStr) {
		//expStr = a+b
		// 安排运算先后顺序
		Stack<Expression> stack = new Stack<>();
		//表达式拆分成字符数组  [a,+,b]
		char[] charArray = expStr.toCharArray();

		Expression left = null;
		Expression right = null;
		//遍历字符数组
		//针对不同情况做处理
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':
				//从stack取出left "a"
				left = stack.pop();
				//取出右边表达式 "b"
				right = new VarExpression(String.valueOf(charArray[++i]));
				//根据left和right构建AddExpresson加入stack
				stack.push(new AddExpression(left, right));//
				break;
			case '-': // 
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				//如果是一个var 就创建一个VarExpression对象 并push到stack
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//当遍历完整个 charArray数组后  栈中就得到最后的Expression
		this.expression = stack.pop();
	}

	/**
	 *
	 * @param var
	 * @return
	 */
	public int run(HashMap<String, Integer> var) {
		//将表达式a+b和var={a=10,b=20}绑定
		//然后传递给expression的interpreter进行解释执行
		return this.expression.interpreter(var);
	}
}