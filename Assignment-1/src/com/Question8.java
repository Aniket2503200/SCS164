//Question8
//How to Print a Collection in Java?
package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question8 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "cherry");

		// Using for-each loop
		System.out.println("Using for-each loop:");
		for (String item : list) {
			System.out.println(item);
		}

		// Using Iterator
		System.out.println("\nUsing Iterator:");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Using toString method
		System.out.println("\nUsing toString method:");
		System.out.println(list);

		// Using Java 8 Streams
		System.out.println("\nUsing Java 8 Streams:");
		list.stream().forEach(System.out::println);

		// Using String.join
		System.out.println("\nUsing String.join:");
		System.out.println(String.join(", ", list));
	}
}
