//Question12
//Collections.shuffle() Method in Java with Examples
package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Person1 {
	String name;
	int age;

	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}

public class Question12 {
	public static void main(String[] args) {
		// Example with ArrayList
		List<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape"));
		System.out.println("Original ArrayList: " + arrayList);
		Collections.shuffle(arrayList);
		System.out.println("Shuffled ArrayList: " + arrayList);

		// Example with LinkedList
		List<String> linkedList = new LinkedList<>(Arrays.asList("dog", "cat", "mouse", "elephant", "lion", "tiger"));
		System.out.println("\nOriginal LinkedList: " + linkedList);
		Collections.shuffle(linkedList);
		System.out.println("Shuffled LinkedList: " + linkedList);

		// Example with Integer List
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("\nOriginal Integer List: " + integerList);
		Collections.shuffle(integerList);
		System.out.println("Shuffled Integer List: " + integerList);

		// Example with Custom Object List
		List<Person1> personList = new ArrayList<>();
		personList.add(new Person1("Alice", 30));
		personList.add(new Person1("Bob", 25));
		personList.add(new Person1("Charlie", 35));
		personList.add(new Person1("David", 40));
		personList.add(new Person1("Eve", 20));

		System.out.println("\nOriginal Person List: " + personList);
		Collections.shuffle(personList);
		System.out.println("Shuffled Person List: " + personList);

		// Example with a Specific Random Seed
		List<String> seedList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape"));
		System.out.println("\nOriginal ArrayList with seed: " + seedList);
		Random rand = new Random(42); // Specifying a seed for reproducibility
		Collections.shuffle(seedList, rand);
		System.out.println("Shuffled ArrayList with seed: " + seedList);
	}
}
