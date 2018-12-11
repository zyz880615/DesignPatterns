package com.design.templateMethod.WOW;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public abstract class AbstractStudy {

	/**
	 * 第一步
	 * 上网搜索副本攻略(这步一样)
	 */
	void searchGuidesOfDungeon() {
		System.out.println("上网搜索副本攻略");
	}

	/**
	 * 第二步
	 * 观看打本视频(此处不一样)
	 */
	abstract void videosOfDungeon();

	/**
	 * 第三步
	 * 去NGA圣光区精华帖(这步不一样)
	 */
	void enterTheNGA() {
		System.out.println("去NGA圣光区精华帖");
	}

	/**
	 * 第四步
	 * 选择打本天赋(这步不一样)
	 */
	abstract void selectGift();

	/**
	 * 第五步
	 * 准备合剂、烹饪(这步不一样)
	 */
	abstract void prepareFood();

	/**
	 * 第六步
	 * 叫上基友打本(这步一样)
	 */
	void enterTheDungeon() {
		System.out.println("叫上基友打本");
	}

	/**
	 * 整个学习步骤
	 */
	final void playProcess() {
		this.searchGuidesOfDungeon();
		this.videosOfDungeon();
		this.enterTheNGA();
		this.selectGift();
		this.prepareFood();
		this.enterTheDungeon();
	}
}
