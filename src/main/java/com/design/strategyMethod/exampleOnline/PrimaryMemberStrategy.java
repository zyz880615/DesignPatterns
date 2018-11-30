package com.design.strategyMethod.exampleOnline;

/**
 * Created by kaolafm on 2018/11/26.
 *
 * @author zhangyz
 */
public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {

		System.out.println("对于初级会员的没有折扣");
		return booksPrice;
	}
}
