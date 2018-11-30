package com.design.strategyMethod.WOW;

/**
 * Created by kaolafm on 2018/11/26.
 *
 * @author zhangyz
 */
public class Client {

	public static void main(String[] args){
		SkillStrategy skillStrategy = new ShengGuangShanXian();

		Skill skill = new Skill(skillStrategy);

		double manna = skill.play(100000);

		System.out.println("该技能蓝耗是：" + manna);
	}

}
