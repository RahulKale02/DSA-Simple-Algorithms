package Sorting_Algorithms;

public class InsertionSort {

	public static void main(String[] args) {

		System.out.println(" \n\nInsertion Sorting Algorithem...\n\n");
		int arr[] = { 213, 34, 56, 7, 98, 45, 23, 12, 34, 56, 766, 89 };
		int size = arr.length;
		// insertion Sorting...
		sortArray(arr);

	}

	public static void sortArray(int arr[]) {
		
		int n = arr.length - 1;
		System.out.println("Befor :\n");
		for (int a = 0; a < n; a++) {

			System.out.print("  " + arr[a]);
		}
		
		for (int i = 1; i < n; i++) {
			int start = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > start) {
				arr[j + 1] = arr[j]; // arr[1]= arr[0] -> arr[1]= 213
				j--;
			}
			arr[j + 1] = start; // arr[0] = 34
		}
		System.out.println("\n\nAfter :\n");
		
		for (int a = 0; a < n; a++) {

			System.out.print("  " + arr[a]);
		}

	}

}
