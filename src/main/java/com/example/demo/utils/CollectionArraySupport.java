package com.example.demo.utils;

import java.util.Arrays;
import java.util.List;

public class CollectionArraySupport {

	/**
	 * 3.3 Collection to an Array
	 */
	public static void validate() {
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = sampleList.toArray(String[]::new);
		System.out.println("Array: " + sampleArray);
	}
}
