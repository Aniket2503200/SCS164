//Question7
//Java Program to Compare Elements in a Collection
package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question7 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(50);
		numbers.add(40);

		// Find the maximum and minimum elements
		int maxElement = Collections.max(numbers);
		int minElement = Collections.min(numbers);

		System.out.println("Maximum element: " + maxElement);
		System.out.println("Minimum element: " + minElement);

		// Create and populate two lists of strings
		List<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cherry");

		List<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Banana");
		list2.add("Cherry");

		// Check if the two lists are equal
		boolean areEqual = list1.equals(list2);
		System.out.println("\nAre the two lists equal? " + areEqual);

		// Sort a list of fruits
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Elderberry");
		fruits.add("Cherry");
		fruits.add("Date");

		Collections.sort(fruits);
		System.out.println("\nSorted list: " + fruits);

		// Sort the list in reverse order using a custom comparator
		Collections.sort(fruits, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); // Reverse order
			}
		});
		System.out.println("Sorted list in reverse order: " + fruits);
	}
}
