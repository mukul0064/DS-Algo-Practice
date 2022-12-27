package com.mukul.interviewBit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//Occurence of Each Number
//
//Problem Description
//You are given an integer array A.
//You have to find the number of occurences of each number.
//Return an array containing only the occurences with the smallest value's occurence first.
//
//For example, A = [4, 3, 3], you have to return an array [2, 1], where 2 is the number of occurences for element 3, 
//and 1 is the number of occurences for element 4. But, 2 comes first because 3 is smaller than 4.
//
//Problem Constraints
//1 <= |A| <= 105
//1 <= Ai <= 109
//
//Input Format
//The first argument is the integer array A.
//
//
//Output Format
//Return an integer array denoting the occurences of each number.
//
//Example Input
//Input 1:
//A = [1, 2, 3]
//Input 2:
//A = [4, 3, 3]
//
//Example Output
//Output 1:
//[1, 1, 1]
//Output 2:
//[2, 1]
//
//Example Explanation
//Explanation 1:
//All the elements occur once, so the resultant array should be [1, 1, 1].
//Explanation 2:
//Explained in the description above.

public class OccurenceOfEachNumber {
	
//	The time complexity of the given code is O(n * log(n)), where n is the length of the input array a. 
//	This is because the first loop has a time complexity of O(n), and the sorting of the array has a time 
//	complexity of O(n * log(n)).
//
//	The space complexity of the given code is O(n), as the input array is copied into the map and the ArrayList. 
//	The map and the ArrayList will each have a maximum size of n, so the space complexity is O(n).
//
//	Note: The time complexity of the given code can be further optimized by using a counting sort instead 
//	of a comparison-based sort like quicksort or mergesort. 
//	A counting sort has a time complexity of O(n), which is more efficient for sorting arrays 
//	with a small range of values. However, this optimization would increase the space complexity to O(k), 
//	where k is the range of values in the array.

	public static void main(String[] args) {
		
		int[] A = {56, 35, 25, 32, 41, 50, 7, 52, 34, 41, 72, 12, 93, 50, 19, 94, 13, 19};
		
		int[] result = findOccurences(A);
		
		System.out.println(Arrays.toString(result));

	}

	private static int[] findOccurences(int[] a) {
		
		Arrays.sort(a);
		Map<Integer, Integer> m = new TreeMap<>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i : a)
		{
			m.put(i, m.getOrDefault(i, 0) + 1);
		}
		for (Entry<Integer, Integer> entry : m.entrySet())
		{
			al.add(entry.getValue());
		}
		int[] result = al.stream().mapToInt(Integer::intValue).toArray();
		return result;
	}

}
