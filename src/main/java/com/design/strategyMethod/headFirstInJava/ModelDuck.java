package com.design.strategyMethod.headFirstInJava;

/**
 * Created by kaolafm on 2018/11/27.
 *
 * @author zhangyz
 */
public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display(){
		System.out.println("I'm a model duck");
	}
}
