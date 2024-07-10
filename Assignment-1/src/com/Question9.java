//Question9
//How to Make a Collection Read-Only in Java?
package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question9 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(Arrays.asList("apple", "banana", "cherry"));
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(2, "banana");
		map.put(3, "cherry");

		// Creating unmodifiable views
		Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
		Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);

		System.out.println("Read-only set: " + unmodifiableSet);
		System.out.println("Read-only map: " + unmodifiableMap);

		// Trying to modify the unmodifiable set will result in
		// UnsupportedOperationException
		try {
			unmodifiableSet.add("date");
		} catch (UnsupportedOperationException e) {
			System.out.println("Cannot modify the read-only set");
		}

		// Trying to modify the unmodifiable map will result in
		// UnsupportedOperationException
		try {
			unmodifiableMap.put(4, "date");
		} catch (UnsupportedOperationException e) {
			System.out.println("Cannot modify the read-only map");
		}
	}
}
