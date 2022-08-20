package com.example.demo.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateMethodSupport {

	/**
	 * 3.4 The Not Predicate Method
	 */
	public static void validate() {
		List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
		List<String> withoutBlanks = sampleList.stream()
		  .filter(Predicate.not(String::isBlank))
		  .collect(Collectors.toList());
		//assertThat(withoutBlanks).containsExactly("Java", "Kotlin");
		System.out.println("List: " + withoutBlanks);
	}
}
