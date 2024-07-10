//Question-1
//Java Program to Get the Maximum Element From a Vector
package com;

import java.util.Collections;
import java.util.Vector;

public class Question1 {
	public static void main(String[] args) {
		// Create a Vector and add some elements
		Vector<Integer> numbers = new Vector<>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(200);
		numbers.add(50);
		numbers.add(40);
		numbers.add(70);
		numbers.add(150);
		numbers.add(40);

		// Find the maximum element in the Vector
		int maxElement = Collections.max(numbers);

		// Print the maximum element
		System.out.println("The maximum element in the vector is: " + maxElement);
	}
}
