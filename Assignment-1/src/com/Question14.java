//Question14
//How to Iterate HashMap in Java?
package com;

import java.util.HashMap;
import java.util.Map;

public class Question14 {
	public static void main(String[] args) {
		// Creating a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 10);
		map.put("banana", 20);
		map.put("cherry", 30);

		// Iterating through keys using keySet()
		System.out.println("Iterating through keys:");
		for (String key : map.keySet()) {
			System.out.println("Key: " + key);
		}

		// Iterating through values using values()
		System.out.println("\nIterating through values:");
		for (Integer value : map.values()) {
			System.out.println("Value: " + value);
		}

		// Iterating through entries using entrySet()
		System.out.println("\nIterating through entries:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
