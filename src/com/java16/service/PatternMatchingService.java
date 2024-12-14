package com.java16.service;

public class PatternMatchingService {
	
	public void printStringLength(Object object) {
		if(object instanceof String str) {
			System.out.println(str.length());
		}
	}

}
