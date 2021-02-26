package com.revature.joseph.designpatterns;

public class FactorySimulator {
	public static void main(String[] args) {
		Currency money = CurrencyFactory.createCurrency("canada");
		System.out.println(money.getCurrencySymbol());
	}
}
