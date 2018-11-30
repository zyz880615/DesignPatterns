package com.design.strategyMethod.exampleOnline;

/**
 * Created by kaolafm on 2018/11/26.
 *
 * @author zhangyz
 */
public interface MemberStrategy {
	/**
	 * 计算图书的价格
	 * @param booksPrice	图书的原价
	 * @return		计算出打折后的价格
	 */
	double calcPrice(double booksPrice);

}
