//Question13
//How to Get a Size of Collection in Java?
package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Question13 {
	public static void main(String[] args) {
		// Example with ArrayList
		List<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		System.out.println("Size of ArrayList: " + arrayList.size());

		// Example with LinkedList
		List<String> linkedList = new LinkedList<>(Arrays.asList("dog", "cat", "mouse"));
		System.out.println("Size of LinkedList: " + linkedList.size());

		// Example with HashSet
		Set<String> hashSet = new HashSet<>(Set.of("red", "green", "blue"));
		System.out.println("Size of HashSet: " + hashSet.size());

		// Example with TreeSet
		Set<String> treeSet = new TreeSet<>(Set.of("orange", "yellow", "purple"));
		System.out.println("Size of TreeSet: " + treeSet.size());

		// Example with HashMap
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Alice");
		hashMap.put(2, "Bob");
		hashMap.put(3, "Charlie");
		System.out.println("Size of HashMap: " + hashMap.size());

		// Example with TreeMap
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "David");
		treeMap.put(2, "Eve");
		treeMap.put(3, "Frank");
		System.out.println("Size of TreeMap: " + treeMap.size());

		// Example with custom objects
		List<Person2> personList = new ArrayList<>();
		personList.add(new Person2("John", 30));
		personList.add(new Person2("Mary", 25));
		personList.add(new Person2("Sam", 35));
		System.out.println("Size of Person List: " + personList.size());
	}
}
