package com.design.strategyMethod.headFirstInJava;

/**
 * Created by kaolafm on 2018/11/27.
 *
 * @author zhangyz
 */
public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}
