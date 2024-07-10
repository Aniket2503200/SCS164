//Question10
//Java Program to Remove a Specific Element From a Collection
package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question10 {
	public static void main(String[] args) {
		// List example
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		System.out.println("Original list: " + list);
		list.remove("banana");
		System.out.println("List after removing 'banana': " + list);

		// Set example
		Set<String> set = new HashSet<>(Set.of("apple", "banana", "cherry"));
		System.out.println("\nOriginal set: " + set);
		set.remove("banana");
		System.out.println("Set after removing 'banana': " + set);

		// Map example
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(2, "banana");
		map.put(3, "cherry");
		System.out.println("\nOriginal map: " + map);
		map.remove(2);
		System.out.println("Map after removing entry with key 2: " + map);

		// Generic Collection example
		Collection<String> collectionList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		Collection<String> collectionSet = new HashSet<>(Set.of("apple", "banana", "cherry"));
		System.out.println("\nOriginal collectionList: " + collectionList);
		System.out.println("Original collectionSet: " + collectionSet);
		removeElement(collectionList, "banana");
		removeElement(collectionSet, "banana");
		System.out.println("collectionList after removing 'banana': " + collectionList);
		System.out.println("collectionSet after removing 'banana': " + collectionSet);
	}

	public static <T> void removeElement(Collection<T> collection, T element) {
		collection.remove(element);
	}
}
