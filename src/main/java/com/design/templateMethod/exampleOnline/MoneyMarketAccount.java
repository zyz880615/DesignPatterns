package com.design.templateMethod.exampleOnline;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public class MoneyMarketAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		return "Money Market";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.045;
	}
}
