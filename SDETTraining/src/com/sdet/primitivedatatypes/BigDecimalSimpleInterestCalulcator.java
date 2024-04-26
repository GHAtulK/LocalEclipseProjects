package com.sdet.primitivedatatypes;

import java.math.BigDecimal;

public class BigDecimalSimpleInterestCalulcator {

	BigDecimal principal;
	BigDecimal interest;

	public BigDecimalSimpleInterestCalulcator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {

		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		//Total Value = principal + principal * interest * noOfYears
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
		return totalValue;
	}

}
