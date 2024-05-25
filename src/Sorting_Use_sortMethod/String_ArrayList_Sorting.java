package Sorting_Use_sortMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class String_ArrayList_Sorting {

	public static void main(String[] args) {
		ArrayList<String> std = new ArrayList<String>();

		std.add("Bhumeshowar");
		std.add("Yogesh");
		std.add("Rahul");
		std.add("Arun");
		std.add("AB");
		std.add("A");

		System.out.println("\n\n        "+std);

		SortingArray(std);

	}

	private static void SortingArray(ArrayList<String> std) {

		Collections.sort(std); // Sorting ArrayList
		System.out.println("\nSorting String : " + std);

		Collections.sort(std.reversed()); // sorting ArrayList as reversed order
		System.out.println("\nSorting and Reversed order String : " + std); // print reversed oder ArrayList

		Collections.sort(std, Comparator.comparing(String::length));
		System.out.println("\nSmall name starting : " + std);

		Collections.sort(std, Comparator.comparing(String::length).reversed());
		System.out.println("\nLong name starting : " + std);

	}

}
