package com.java16.app;

import com.java16.service.PatternMatchingService;
import com.java16.service.RecordService;

public class App {
	
	public static void main(String[] args) {
		
		PatternMatchingService pattern = new PatternMatchingService();
		pattern.printStringLength("ertyu");
		RecordService recordService = new RecordService();
		recordService.getPerson();
	}

}
