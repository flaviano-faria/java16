package com.java16.app;

import com.java16.service.PatternMatchingService;
import com.java16.service.RecordService;
import com.java16.service.StreamToListService;

public class App {
	
	public static void main(String[] args) {
		
		PatternMatchingService pattern = new PatternMatchingService();
		pattern.printStringLength("ertyu");
		RecordService recordService = new RecordService();
		recordService.getPerson();
		
		StreamToListService streamService = new StreamToListService();
		streamService.getStreamToList();
	}

}
