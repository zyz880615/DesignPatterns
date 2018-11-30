package com.design.strategyMethod.headFirstInJava;

/**
 * Created by kaolafm on 2018/11/26.
 *
 * @author zhangyz
 */
public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
