package Sorting_Use_sortMethod;

import java.util.Arrays;
import java.util.Iterator;

public class Integer_Sorign {

	public static void main(String[] args) {

		int arr[] = { 213, 34, 56, 7, 98, 45, 23, 12, 34, 56, 766, 89 };
		int size = arr.length;

		System.out.println("Befor Array :\n");
		
		for (int i : arr) {
			
			System.out.print(i+"  ");
		}
		

		// insertion Sorting...
		int SortArray[] = sortArray(arr);

		System.out.println("\n\nAfter Array :"+ "\n");
		for (int i : SortArray) {
			
			System.out.print(i+"  ");
		}
		
	}

	private static int[] sortArray(int[] arr) {

		Arrays.sort(arr);	
		return arr;
	}
}
