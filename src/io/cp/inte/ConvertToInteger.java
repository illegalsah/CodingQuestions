package io.cp.inte;

import java.math.BigInteger;
import java.util.Scanner;

public class ConvertToInteger {

	public static int _1stWayParseInt(String input) {
		int ret = Integer.parseInt(input);
		return ret;
	}

	public static int _2ndWayValueOf(String input) {
		int ret = Integer.valueOf(input);
		return ret;
	}

	public static int _3rdWayScanner(String input) {
		Scanner scn = new Scanner(input);
		int ret = scn.nextInt();
		scn.close();
		return ret;
	}
	
	public static int _4thWayBigInteger(String input) {
		BigInteger big = new BigInteger(input);
		int ret = big.intValue();
		return ret;
	}
	
	public static int _5thWayCharConversion(String input) {
		int i = 0;
		int ret = 0;
		
		while(i < input.length()) {
			char c = input.charAt(i);
			ret = (ret * 10) + (c - '0');
			i++;
		}
		return ret;
	}
}
