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
	
	public static boolean hasTrue(String ...args) {
		for(int i=0;i<args.length-1;i++) {
			if(args[i].equals(args[i+1])) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}

}
