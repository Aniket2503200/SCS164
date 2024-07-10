//Question2
//Binary Search on Java Vector
package com;

import java.util.Collections;
import java.util.Vector;

public class Question2 {
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(50);
		numbers.add(40);

		Collections.sort(numbers);
		int searchElement = 30;

		int index = Collections.binarySearch(numbers, searchElement);

		if (index >= 0) {
			System.out.println("Element " + searchElement + " found at index: " + index);
		} else {
			System.out.println("Element " + searchElement + " not found in the vector.");
		}
	}
}
