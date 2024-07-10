//Question11
//Collections.reverse() Method in Java with Examples
package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}

public class Question11 {
	public static void main(String[] args) {
		// Example with ArrayList
		List<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		System.out.println("Original ArrayList: " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("Reversed ArrayList: " + arrayList);

		// Example with LinkedList
		List<String> linkedList = new LinkedList<>(Arrays.asList("dog", "cat", "mouse"));
		System.out.println("\nOriginal LinkedList: " + linkedList);
		Collections.reverse(linkedList);
		System.out.println("Reversed LinkedList: " + linkedList);

		// Example with Integer List
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("\nOriginal Integer List: " + integerList);
		Collections.reverse(integerList);
		System.out.println("Reversed Integer List: " + integerList);

		// Example with Custom Object List
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Alice", 30));
		personList.add(new Person("Bob", 25));
		personList.add(new Person("Charlie", 35));

		System.out.println("\nOriginal Person List: " + personList);
		Collections.reverse(personList);
		System.out.println("Reversed Person List: " + personList);
	}
}
