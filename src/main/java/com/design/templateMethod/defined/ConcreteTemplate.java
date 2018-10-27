package com.design.templateMethod.defined;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public class ConcreteTemplate extends AbstractMethod {
	//基本方法的实现
	@Override
	protected void abstractMethod() {
		//业务相关的代码
	}

	//重写父类的方法
	@Override
	protected void hookMethod() {
		//业务相关的代码
	}
}
