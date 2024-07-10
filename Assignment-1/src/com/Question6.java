//Question6
//Java Program to Change a Collection to an Array
package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Question6 {
	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<>();
		fruitsList.add("Apple");
		fruitsList.add("Banana");
		fruitsList.add("Cherry");
		fruitsList.add("Date");
		fruitsList.add("Elderberry");

		// Convert ArrayList to array
		String[] fruitsArrayFromList = fruitsList.toArray(new String[0]);
		System.out.println("Array from ArrayList:");
		for (String fruit : fruitsArrayFromList) {
			System.out.println(fruit);
		}

		// Create and populate a LinkedList
		List<String> fruitsLinkedList = new LinkedList<>(fruitsList);

		// Convert LinkedList to array
		String[] fruitsArrayFromLinkedList = fruitsLinkedList.toArray(new String[0]);
		System.out.println("\nArray from LinkedList:");
		for (String fruit : fruitsArrayFromLinkedList) {
			System.out.println(fruit);
		}

		// Create and populate a HashSet
		Set<String> fruitsSet = new HashSet<>(fruitsList);

		// Convert HashSet to array
		String[] fruitsArrayFromSet = fruitsSet.toArray(new String[0]);
		System.out.println("\nArray from HashSet:");
		for (String fruit : fruitsArrayFromSet) {
			System.out.println(fruit);
		}
	}
}
