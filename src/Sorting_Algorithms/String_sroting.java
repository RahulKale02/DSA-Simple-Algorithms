package Sorting_Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class String_sroting {

	public static void main(String[] args) {

		String friends[] = { "Girish", "Harish", "Isha", "Javed", "Dipak ", "Faiem", "Elvish", "Carry", "Bhumesh",
				"Arun" };

		System.out.println(" Befor Aarray :");

		for (String string : friends) {
			System.out.print(string + " | ");
		}
		System.out.println(" \n\n After Array :");

		String MethodBaseSorting[] = MethSorting(friends); // Call on Sorting user Methos .sorting(arr)
//		String SortFriendList[] = SortingList(friends);  	// Call on sorting user defined logic

		for (String string : MethodBaseSorting) {
			System.out.print(string + " | ");
		}
	}

	private static String[] MethSorting(String[] friends) {

		Arrays.sort(friends);
//		System.out.println(Arrays.toString(friends));

		return friends;
	}

	public static String[] SortingList(String[] friends) {

		for (int i = 0; i < friends.length; i++) {
			for (int j = i + 1; j < friends.length; j++) {

				if (friends[i].compareTo(friends[j]) > 0) { // Compare rist anrray and second array
					String temp = friends[i];
					friends[i] = friends[j];
					friends[j] = temp;
				}
			}
		}

		return friends;
	}
}