package com.design.strategyMethod.headFirstInJava;

/**
 * Created by kaolafm on 2018/11/27.
 *
 * @author zhangyz
 */
public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
