package com.design.strategyMethod.exampleOnline;

/**
 * Created by kaolafm on 2018/11/26.
 *
 * @author zhangyz
 */
public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {

		System.out.println("对于中级会员的折扣为10%");
		return booksPrice * 0.9;
	}
}
