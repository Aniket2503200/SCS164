//Question15
//How to Use Enumeration to Display Elements of Hashtable in Java?
package com;

import java.util.Enumeration;
import java.util.Hashtable;

public class Question15 {
	public static void main(String[] args) {
		// Creating a Hashtable
		Hashtable<String, Integer> hashtable = new Hashtable<>();

		// Adding elements to the Hashtable
		hashtable.put("apple", 10);
		hashtable.put("banana", 20);
		hashtable.put("cherry", 30);

		// Displaying elements using Enumeration
		Enumeration<String> keys = hashtable.keys();
		System.out.println("Elements of Hashtable:");
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			Integer value = hashtable.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}
