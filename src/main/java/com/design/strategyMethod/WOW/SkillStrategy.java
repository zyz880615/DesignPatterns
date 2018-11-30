package com.design.strategyMethod.WOW;

/**
 * Created by kaolafm on 2018/11/26.
 *
 * @author zhangyz
 */
public interface SkillStrategy {
	/**
	 * 计算技能耗蓝量
	 * @param manna	  基础蓝量
	 * @return	该技能耗蓝量
	 */
	double calcManna(double manna);


}
