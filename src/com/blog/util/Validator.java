package com.blog.util;

public class Validator {
	public static boolean hasNull(String... args) {
		for(String arg :args) {
			if(arg==null || arg.equals("")) {
				return true;
			}
		}
		return false;
	}
}
