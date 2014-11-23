package com.hackerrank.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class HalloweenPparty {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		int testCount = Integer.parseInt(myScan.nextLine());
		for (int i = 0; i < testCount; i++) {
			BigDecimal K = new BigDecimal(myScan.nextLine());
			BigDecimal chocolates = getChocolatesCount(K);
			System.out.println(chocolates);
		}
	}

	public static BigDecimal getChocolatesCount(BigDecimal k) {
		BigDecimal sqrt =k.divide(new BigDecimal(2)) ;
		BigDecimal count = sqrt.multiply(k.subtract(sqrt));
		return count;
	}

}
