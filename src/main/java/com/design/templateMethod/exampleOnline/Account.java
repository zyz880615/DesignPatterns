package com.design.templateMethod.exampleOnline;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public abstract class Account {

	/**
	 * 基本方法留给子类实现
	 *
	 * @return
	 */
	protected abstract String doCalculateAccountType();

	/**
	 * 基本方法留给子类实现
	 *
	 * @return
	 */
	protected abstract double doCalculateInterestRate();

	/**
	 * 基本方法，已经实现
	 *
	 * @param accountType
	 * @return
	 */
	private double calculateAmount(String accountType) {
		/**
		 * 省略相关的业务逻辑
		 */
		return 7243.00;
	}

	/**
	 * 模板方法， 计算利息数据
	 *
	 * @return 返回利息数据
	 */
	public final double calculateInterest() {
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount = calculateAmount(accountType);
		return amount * interestRate;
	}

}
