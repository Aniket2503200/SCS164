//Question3
//Java Program to Get Elements of a LinkedList
package com;

import java.util.Iterator;
import java.util.LinkedList;

public class Question3 {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		fruits.add("Elderberry");

		// 1. Using a for-each loop
		System.out.println("Elements in the LinkedList using for-each loop:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// 2. Using an iterator
		System.out.println("\nElements in the LinkedList using iterator:");
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 3. Using a for loop with get method
		System.out.println("\nElements in the LinkedList using for loop with get method:");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
	}
}
