package com.design.templateMethod.exampleOnline;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public class CDAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		return "Certificate of Deposite";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.06;
	}
}
