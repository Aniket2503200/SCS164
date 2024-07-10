//Question16
//Hashtable keySet() Method in Java with Examples

package com;

import java.util.Hashtable;
import java.util.Set;

public class Question16 {
	public static void main(String[] args) {
		// Creating a Hashtable
		Hashtable<String, Integer> hashtable = new Hashtable<>();

		// Adding elements to the Hashtable
		hashtable.put("apple", 10);
		hashtable.put("banana", 20);
		hashtable.put("cherry", 30);

		// Retrieving the key set
		Set<String> keys = hashtable.keySet();

		// Iterating through keys and printing them
		System.out.println("Keys in Hashtable:");
		for (String key : keys) {
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}

		// Checking if a specific key exists
		String searchKey = "banana";
		if (keys.contains(searchKey)) {
			System.out.println("\nKey '" + searchKey + "' exists in Hashtable with value: " + hashtable.get(searchKey));
		} else {
			System.out.println("\nKey '" + searchKey + "' does not exist in Hashtable.");
		}
	}
}
