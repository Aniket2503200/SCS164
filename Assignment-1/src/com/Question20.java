//Question20
//Java Program to Rotate Elements of the List?
package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question20 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println("Original List: " + numbers);

		// Rotate the list by 3 positions to the right
		Collections.rotate(numbers, 3);

		System.out.println("List after rotating by 3 positions to the right: " + numbers);

		// Rotate the list by -2 positions to the left (equivalent to rotating right by
		// 7 positions)
		Collections.rotate(numbers, -2);

		System.out.println("List after rotating by -2 positions to the left: " + numbers);
	}
}
