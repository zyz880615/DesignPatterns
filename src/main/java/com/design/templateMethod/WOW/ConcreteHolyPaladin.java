package com.design.templateMethod.WOW;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public class ConcreteHolyPaladin extends AbstarctStudy {

	@Override
	void videosOfDungeon() {
		System.out.println("观看治疗QS视频");
	}

	@Override
	void selectGift() {
		System.out.println("选择治疗QS天赋");
	}

	@Override
	void prepareFood() {
		System.out.println("准备治疗QS打本合剂、烹饪");
	}
}
