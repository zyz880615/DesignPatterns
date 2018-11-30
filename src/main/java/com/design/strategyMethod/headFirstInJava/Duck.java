package com.design.strategyMethod.headFirstInJava;

/**
 * Created by kaolafm on 2018/11/27.
 *
 * @author zhangyz
 */
public class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {

	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}

	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}

	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
}
