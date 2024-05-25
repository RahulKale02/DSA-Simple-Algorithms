



// Print both are single dimensional array and doubly dimensional array



package Sorting_Algorithms;
import java.io.*;
import java.util.*;

public class Testing {

	public static void main(String[] args) {
//
		int[] arr = new int[5];
//		int array[]={23,5,65,34,22};
		
		arr[0] = 53;
		arr[1] = 43;
		arr[2] = 34;
		arr[3] = 23;
		arr[4] = 23;

		System.out.println("Single Dimantiol array\n");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		// 2D array

		System.out.println("\n\nThis is a 2D array\n");

		int arr1[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 } };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr1[0].length; j++) {

				System.out.print(" " + arr1[i][j]);
			}
			System.out.println();
		}

	}
}
