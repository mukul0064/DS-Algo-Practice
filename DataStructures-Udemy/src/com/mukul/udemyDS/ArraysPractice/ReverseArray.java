package com.mukul.udemyDS.ArraysPractice;

import java.util.Arrays;

//Reversing an array in-place overview:
//
//
//The problem is that we want to reverse a T[] array in O(N) linear time complexity 
//and we want the algorithm to be in-place as well - so the algorithm can not use 
//additional memory!
//
//For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
		
public class ReverseArray {
	public static void main(String[] args) throws Exception {
//**Given Array**
		int[] array = {1, 2, 3, 4, 5};
			System.out.print("Given Array is :" + Arrays.toString(array));			
//Giving some new lines for better visual
			System.out.println();
			System.out.println();
//**Reverse Array Method
		int[] reverseArray = ReverseArray(array);	
			System.out.println("Reverse Array is :" + Arrays.toString(reverseArray));
	}
	
//***Reverse Array Algorithm Implementation***
	private static int[] ReverseArray(int[] array) throws Exception {
		//calculate the size of the given array
		//create another array of same size
		//instantiate first index of the newly created array as integer variable
		//run the for loop as per the size in reverse order 
		//store the original array value in the new array created where new array will use the index created in above method
		//and original array will have for loop variable
		//increase the index of the new array created
		//return the new array as result
		int size = array.length;
		int[] reverseArray = new int[size];
		int j = 0;
		for(int i = (size-1);i>=0;i--) {
			reverseArray[j] = array[i];
			j++;
		}
		return reverseArray;
	}
}
