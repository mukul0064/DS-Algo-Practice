package com.mukul.udemyDS.ArraysPractice;

import java.util.Arrays;

//Dutch national flag problem overview
//The problem is that we want to sort a T[] one-dimensional array 
//of integers in O(N) running time - and without any extra memory. 
//The array can contain values: 0, 1 and 2 (check out the theoretical section for further information).
//
//Good luck!

public class DutchNationalFlag_EdsgerDijkstra {

	public static void main(String[] args) {
		//**Given Array with only 0,1 and 2 as elements**
		int[] n = {0, 1, 2, 0, 2, 1, 0, 1, 2};
		System.out.println("Given array is :"+ Arrays.toString(n));
		//Giving some new lines for better visual
		System.out.println();
		System.out.println();
		// This case is unique as by Edsger Dijkstra theorm we usually need array to contain only 3 unique elements (repititive is fine)
		// thus this will be solved by that approach that have o(N) running complexity and no space complecity
		EdsgerDijkstraSort sorting = new EdsgerDijkstraSort(n);
		sorting.solve();
		System.out.println("Sorted array by Edsger Dijkstra algorithm is : ");
		sorting.showResult();
		//Giving some new lines for better visual
		System.out.println();
		System.out.println();
		// sorted the array by inbuilt method that is o(N) and no space complexity
		Arrays.sort(n);
		//
		System.out.println("Sorted array is :" + Arrays.toString(n));
	}

}
