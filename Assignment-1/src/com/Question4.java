//Question4
//LinkedList clear() Method in Java

package com;

import java.util.LinkedList;

public class Question4 {
	public static void main(String[] args) {
		// Create a LinkedList and add some elements
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		fruits.add("Elderberry");

		System.out.println("Elements in the LinkedList before clearing:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		fruits.clear();

		// Print the LinkedList after clearing
		System.out.println("\nElements in the LinkedList after clearing:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Check if the LinkedList is empty
		if (fruits.isEmpty()) {
			System.out.println("\nThe LinkedList is now empty.");
		}
	}
}
