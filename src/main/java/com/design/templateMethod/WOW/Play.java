package com.design.templateMethod.WOW;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public class Play {

	public static void main(String[] args) {
		AbstarctStudy concreteRetributionPaladin = new ConcreteRetributionPaladin();
		concreteRetributionPaladin.playProcess();
		AbstarctStudy concreteHolyPaladin = new ConcreteHolyPaladin();
		concreteHolyPaladin.playProcess();
	}

}
