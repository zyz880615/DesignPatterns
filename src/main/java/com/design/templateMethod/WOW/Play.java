package com.design.templateMethod.WOW;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public class Play {

	public static void main(String[] args) {
		AbstractStudy concreteRetributionPaladin = new ConcreteRetributionPaladin();
		concreteRetributionPaladin.playProcess();
		AbstractStudy concreteHolyPaladin = new ConcreteHolyPaladin();
		concreteHolyPaladin.playProcess();
	}

}
