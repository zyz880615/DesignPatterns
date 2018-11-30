package com.design.strategyMethod.headFirstInJava;

/**
 * Created by kaolafm on 2018/11/27.
 *
 * @author zhangyz
 */
public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}
}
