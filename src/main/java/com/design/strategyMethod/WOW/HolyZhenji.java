package com.design.strategyMethod.WOW;

/**
 * Created by kaolafm on 2018/11/26.
 *
 * @author zhangyz
 */
public class HolyZhenji implements SkillStrategy {

	@Override
	public double calcManna(double manna) {
		return manna * 0.08;
	}
}
