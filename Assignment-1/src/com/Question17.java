//Question17
//Min and Max in a List in Java
package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question17 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

		// Using Collections.min() to find minimum
		Integer min = Collections.min(numbers);
		System.out.println("Minimum value: " + min);

		// Using Collections.max() to find maximum
		Integer max = Collections.max(numbers);
		System.out.println("Maximum value: " + max);
	}
}
