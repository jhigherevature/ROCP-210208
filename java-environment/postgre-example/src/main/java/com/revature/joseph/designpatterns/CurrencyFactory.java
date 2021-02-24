package com.revature.joseph.designpatterns;

/*
 * A factory design pattern is used to generate the appropriate classes
 * as we need them, when involving a class heirarchy using interface methods
 */
public class CurrencyFactory {
	public static Currency createCurrency(String country) {
		switch(country.toLowerCase()) {
		case "usa":
			return new USDollar();
		case "canada":
			return new CanadianDollars();
		case "France":
			return new Euro();
		case "Italy":
			return new Euro();
		case "Japan":
			return new Yen();
		default:
			return new USDollar();
		}
	}
}
