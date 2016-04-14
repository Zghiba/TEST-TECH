package com.zz.example;

import java.util.HashMap;
import java.util.Map;

public class Constant {

	// max number to print
	public static final int MAX_NUMBER_TO_PRINT = 100;

	// String to replace 3,5,7 
    public static final String FOO_PATTERN = "Foo";
    public static final String BAR_PATTERN = "Bar";
    public static final String QIX_PATTERN = "Qix";

    public static final String[] DIGIT_SORTED_PATTERNS = { "", "", "", FOO_PATTERN, "", BAR_PATTERN, "", QIX_PATTERN, "", "" };
   
    public static final Map<Character, String> CHAR_SORTED_PATTERNS;
 
    static {
    	CHAR_SORTED_PATTERNS = new HashMap<Character, String>();
    	CHAR_SORTED_PATTERNS.put('0', "");
    	CHAR_SORTED_PATTERNS.put('1', "");
    	CHAR_SORTED_PATTERNS.put('2', "");
    	CHAR_SORTED_PATTERNS.put('3', FOO_PATTERN);
    	CHAR_SORTED_PATTERNS.put('4', "");
    	CHAR_SORTED_PATTERNS.put('5', BAR_PATTERN);
    	CHAR_SORTED_PATTERNS.put('6', "");
    	CHAR_SORTED_PATTERNS.put('7', QIX_PATTERN);
    	CHAR_SORTED_PATTERNS.put('8', "");
    	CHAR_SORTED_PATTERNS.put('9', "");
    }

}
