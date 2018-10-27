package com.design.templateMethod.WOW;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public class ConcreteRetributionPaladin extends AbstarctStudy {

	@Override
	void videosOfDungeon() {
		System.out.println("观看惩戒QS视频");
	}

	@Override
	void selectGift() {
		System.out.println("选择惩戒QS天赋");
	}

	@Override
	void prepareFood() {
		System.out.println("准备惩戒QS打本合剂、烹饪");
	}
}
