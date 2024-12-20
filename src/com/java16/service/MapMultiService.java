package com.java16.service;

import java.util.List;
import java.util.stream.Stream;

public class MapMultiService {
	
	public void getMapMultiStream() {
		 List<String> list = Stream.of("Map", "Multi").<String>mapMulti((str,downStream) -> {
			 for(char ch: str.toCharArray()) {
				 downStream.accept(String.valueOf(ch));
			 }
		 }).toList();
		 
		 System.out.println(list);
	}

}
