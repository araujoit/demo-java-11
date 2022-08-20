package com.example.demo.utils;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethodsSupport {

	/**
	 * 3 New String Methods: isBlank, lines, strip, stripLeading, stripTrailing, and repeat	
	 */
	public static void validate() {
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";
		List<String> lines = multilineString.lines()
		  .filter(line -> !line.isBlank())
		  .map(String::strip)
		  .collect(Collectors.toList());
		
		System.out.println("Lines: " + lines);
	}
}
