package Sorting_Use_sortMethod;

import java.util.Arrays;

public class String_Soring {

	public static void main(String[] args) {

		System.out.println("this is Integer element Soring for use a sort method........");

		int num[] = { 34, 56, 87, 34, 23, 45, 90, 45, 25, 10 };

		System.out.print("\nBefor Array : ");
		for (int i : num) {
			System.out.print(i + "  ");
		}

		Arrays.sort(num);
		System.out.print("\n\nAfter Array : ");

		for (int i : num) {
			System.out.print(i + "  ");
		}

	}

}
