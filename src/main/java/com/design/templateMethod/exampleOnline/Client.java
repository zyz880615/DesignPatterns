package com.design.templateMethod.exampleOnline;

/**
 * Created by kaolafm on 2018/10/27.
 *
 * @author zhangyz
 */
public class Client {

	public static void main(String[] args){
		Account moneyMarketAccount = new MoneyMarketAccount();
		System.out.println("货币市场账号的利息数额为: " + moneyMarketAccount.calculateInterest());
		Account cdAccount = new CDAccount();
		System.out.println("定期账号的利息数额为: " + cdAccount.calculateInterest());
	}

}
