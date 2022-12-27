package com.mukul.interviewBit.ArrayPractice;

//Max Min
//Asked In:
//Google
//Problem Description
//Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
//NOTE: You should make minimum number of comparisons.
//
//Problem Constraints
//1 <= N <= 105
//-109 <= A[i] <= 109
//
//Input Format
//First and only argument is an integer array A of size N.
//
//Output Format
//Return an integer denoting the sum Maximum and Minimum element in the given array.
//
//Example Input
//Input 1:
// A = [-2, 1, -4, 5, 3]
//Input 2:
// A = [1, 3, 4, 1]
//
//
//Example Output
//Output 1:
// 1
//Output 2:
// 5
//
//Example Explanation
//Explanation 1:
// Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1. 
//Explanation 2:
// Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.


import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int[] A = {-2, 1, -4, 5, 3};
		int result = solve(A);
		System.out.println(result);
	}
	
	
//	The time complexity of this code is O(n log n), because the call to the sort method has a 
//	time complexity of O(n log n) for sorting an array of n elements.
//
//	The space complexity of this code is O(1), because the space required is independent of the 
//	size of the input. The only space required is for the variables 
//	size and A, which are constant regardless of the size of the input.
	
	public static int solve(int[] A) {
        Arrays.sort(A);
        int size = A.length;
        return (A[0] + A[size-1]);
    }
}
