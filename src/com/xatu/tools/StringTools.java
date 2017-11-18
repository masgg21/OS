package com.xatu.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTools extends Tools {
	/**
	 * ×Ö·û´®¸ñÊ½»¯
	 * 
	 * @param number
	 * @return
	 */
	public static String format(double number) {
		return (String.format("%.2f", number));
	}
}
