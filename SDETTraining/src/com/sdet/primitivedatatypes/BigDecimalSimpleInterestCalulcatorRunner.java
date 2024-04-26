package com.sdet.primitivedatatypes;

import java.math.BigDecimal; //BigDecimal is not a primitive data type, it's a class

public class BigDecimalSimpleInterestCalulcatorRunner {

	public static void main(String[] args) {

		BigDecimalSimpleInterestCalulcator calculator = new BigDecimalSimpleInterestCalulcator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);// 5 years
		System.out.println(totalValue);

	}

}
