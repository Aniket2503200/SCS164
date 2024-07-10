//Question5
//Convert an Array into Collection in Java
package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Question5 {
	public static void main(String[] args) {
		String[] fruitsArray = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };

		// Convert array to a List using Arrays.asList
		List<String> fruitsList = Arrays.asList(fruitsArray);
		System.out.println("List: " + fruitsList);

		// Convert the List to an ArrayList
		ArrayList<String> fruitsArrayList = new ArrayList<>(fruitsList);
		System.out.println("ArrayList: " + fruitsArrayList);

		// Convert the List to a LinkedList
		LinkedList<String> fruitsLinkedList = new LinkedList<>(fruitsList);
		System.out.println("LinkedList: " + fruitsLinkedList);

		// Convert the List to a HashSet
		HashSet<String> fruitsHashSet = new HashSet<>(fruitsList);
		System.out.println("HashSet: " + fruitsHashSet);

		// You can also convert directly from array to ArrayList
		ArrayList<String> directArrayList = new ArrayList<>(Arrays.asList(fruitsArray));
		System.out.println("Direct ArrayList: " + directArrayList);
	}
}
