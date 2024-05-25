package Sorting_Use_sortMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Integer_ArrayList_Sorting {

	public static void main(String [] args)
	{	
		ArrayList<Integer> RollNum =new ArrayList<Integer>();
		
		RollNum.add(212);
		RollNum.add(323);
		RollNum.add(545);
		RollNum.add(122);
		RollNum.add(545);
		RollNum.add(545);
		RollNum.add(545);
		
		System.out.println("Sorting ArrayList Stored Elements.....\n");
		
		System.out.print("\n\nBefor ArrayList Elemetns :  ");
		System.out.print(RollNum);
		
		Collections.sort(RollNum);
		System.out.print("\nAfter Sorting ArrayList Elements : ");
		System.out.print(RollNum);
			
		
		
		
	}
	
	
}
