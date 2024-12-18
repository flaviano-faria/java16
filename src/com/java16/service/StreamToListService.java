package com.java16.service;

import java.util.List;
import java.util.stream.Stream;

public class StreamToListService {
	
	public void getStreamToList() {
		List<String> list = Stream.of("1","2","3").toList();
		
		list.stream().forEach(n -> System.out.println(n));
	}

}
