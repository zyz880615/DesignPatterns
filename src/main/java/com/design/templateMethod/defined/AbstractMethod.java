package com.design.templateMethod.defined;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public abstract class AbstractMethod {

	/**
	 * 模板方法
	 */
	public void templateMethod() {
		//调用基本方法
		abstractMethod();
		hookMethod();
		concreteMethod();
	}

	/**
	 * 基本方法的声明(由子类实现)
	 */
	protected abstract void abstractMethod();

	/**
	 * 基本方法(空方法)
	 */
	protected void hookMethod() {
	}

	private final void concreteMethod() {
		//业务相关的代码
	}

}
