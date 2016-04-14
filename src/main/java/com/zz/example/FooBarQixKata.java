package com.zz.example;

public class FooBarQixKata {

	/**
	 * Execute FooBarQixKata instruction and return result to prints numbers
	 * from 1 to maxNumber
	 * 
	 * @param maxNumber
	 *            : max number to print
	 */
	public String[] execute(int maxNumber) {

		String[] result = new String[maxNumber];

		for (int i = 1; i <= maxNumber; i++) {
			String iValue = String.valueOf(i);
			String line = chackIfDivisible(i, 3) + chackIfDivisible(i, 5) + chackIfDivisible(i, 7) + replace(iValue);
			result[i - 1] = "".equals(line) ? iValue : line;
		}

		return result;
	}

	/**
	 * Checks if a number (iNumberToDivis) is divisible by another (modulo
	 * 3,5,7) and returns the appropriate char.
	 * 
	 * @param NumberToDivis
	 *            : number to divide
	 */
	private String chackIfDivisible(int iNumberToDivide, int modulo) {
		return iNumberToDivide % modulo == 0 ? Constant.DIGIT_SORTED_PATTERNS[modulo] : "";
	}

	/**
	 * Replace the '3', '5' and '7' characters by the appropriate char
	 * 
	 * @param str
	 *            : the string to search in for '3', '5' and '7'
	 */
	private String replace(String str) {
		String result = "";
		for (char c : str.toCharArray()) {
			result += Constant.CHAR_SORTED_PATTERNS.get(c);
		}
		return result;
	}
}
