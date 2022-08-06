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
//**Reverse Array Methods 1
		int[] reverseArray = ReverseArrayMethodOne(array);	
		System.out.println("Reverse Array by method 1 :" + Arrays.toString(reverseArray));
//Giving some line for better visual
		System.out.println();
		System.out.println();
//**Reverse Array Method 2
		reverseArray = ReverseArrayMethodTwo(array);
		System.out.println("Reverse Array by method 2 :" + Arrays.toString(reverseArray));

	}

//***Reverse Array by Algorithm with no extra data store using same array which is passed (Means using constant memory)	
//***Time Complexity is o(N) in worst and o(N/2) as best
//***Space Complexity is same is earlier
	private static int[] ReverseArrayMethodOne(int[] array) {
//		firstly create two integer variables for lower and higher index
//		use while loop to run as index/2 that is lower index < higher index
//		create swap method to swap two variables
//		increment lower index in while loop
//		decrement higher index in while loop
//		after loop ends return the same array which was passed by the user
		int lowerIndex = 0;
		int higherIndex = array.length -1;
		while(lowerIndex < higherIndex) {
			swap(array, lowerIndex, higherIndex);
			lowerIndex ++;
			higherIndex --;
		}
		return array;
	}

	private static void swap(int[] array, int lowerIndex, int higherIndex) {
	int temp = array[lowerIndex];
	array[lowerIndex] = array[higherIndex];
	array[higherIndex]=temp;	
}

//***Reverse Array Direct Algorithm by using another array***
//***Time Complexity is o(N) all round
//***Space Complexity is increased
	private static int[] ReverseArrayMethodTwo(int[] array) throws Exception {
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
