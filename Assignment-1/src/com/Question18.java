//Question18
//How to Find a Sublist in a List in Java?
package com;

import java.util.Arrays;
import java.util.List;

public class Question18 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Finding a sublist from index 2 (inclusive) to index 6 (exclusive)
		List<Integer> sublist = numbers.subList(2, 6);

		// Printing the sublist
		System.out.println("Original List: " + numbers);
		System.out.println("Sublist from index 2 to 6: " + sublist);
	}
}
