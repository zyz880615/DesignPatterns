package com.design.strategyMethod.WOW;

/**
 * Created by kaolafm on 2018/11/26.
 *
 * @author zhangyz
 */
public class Skill {

	private SkillStrategy skillStrategy;

	public Skill(SkillStrategy skillStrategy) {
		this.skillStrategy = skillStrategy;
	}

	public double play(double manna) {
		return this.skillStrategy.calcManna(manna);
	}

}
