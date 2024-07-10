//Question19
//How to replace an element in a list?

package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question19 {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));

		System.out.println("Original List: " + fruits);

		// Replacing the element at index 1 (banana) with "blueberry"
		String oldElement = fruits.set(1, "blueberry");

		System.out.println("Modified List: " + fruits);
		System.out.println("Replaced Element: " + oldElement);
	}
}
