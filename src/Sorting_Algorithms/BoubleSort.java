package Sorting_Algorithms;

import java.util.Scanner;

// Bubble Sorting Algorithm

public class BoubleSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("This is a Bouble Sort Algorithems");
		int arr[] = { 45, 56, 34, 23, 54, 76, 87, 99, 67, 45, 23, 12, 22 }; // Create Array 
		int size = arr.length;
		sortAarr(arr);

	}

	
	// sorting logic in this method
	public static void sortAarr(int arr[]) {
		int size = arr.length - 1;

		for (int i = 0; i <= size; i++) {

			System.out.print("  " + arr[i]); 
			for (int j = 0; j < size; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("\n [ Array is Sort ]");
		for (int x = 0; x <= size; x++) {
			System.out.print("  " + arr[x]);
		}

	}
}
