package com.example.demo.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.lang.NonNull;

public class LocalVariableSyntaxSupport {

	/**
	 * 3.5 Local-Variable Syntax for Lambda
	 */
	public static void validate() {
		List<String> sampleList = Arrays.asList("Java", "Kotlin", null);
		String resultString = sampleList.stream()
		  .filter((var x) -> x != null)
		  .map((@NonNull var x) -> x.toUpperCase())
		  .collect(Collectors.joining(", "));
		System.out.println("UPPERCASED Strings:" + resultString);
	}
}
