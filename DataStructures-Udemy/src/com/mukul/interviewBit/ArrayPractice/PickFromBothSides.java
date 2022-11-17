package com.mukul.interviewBit.ArrayPractice;

import java.lang.Math;

//Problem Description
//
//
//
//Given an integer array A of size N.
//
//You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.
//
//Find and return this maximum possible sum.
//
//NOTE: Suppose B = 4 and array A contains 10 elements then
//
//You can pick the first four elements or can pick the last four elements or can pick 1 from the front and 3 from the back etc. you need to return the maximum possible sum of elements you can pick.
//
//
//Problem Constraints
//1 <= N <= 105
//
//1 <= B <= N
//
//-103 <= A[i] <= 103
//
//
//
//Input Format
//First argument is an integer array A.
//
//Second argument is an integer B.
//
//
//
//Output Format
//Return an integer denoting the maximum possible sum of elements you picked.
//
//
//
//Example Input
//Input 1:
//
// A = [5, -2, 3 , 1, 2]
// B = 3
//Input 2:
//
// A = [1, 2]
// B = 1
//
//
//Example Output
//Output 1:
//
// 8
//Output 2:
//
// 2
//
//
//Example Explanation
//Explanation 1:
//
// Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
//Explanation 2:
//
// Pick element 2 from end as this is the maximum we can get

public class PickFromBothSides {

	public static void main(String[] args) {
		int [] a = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
		int b =48;
		System.out.println("Result: " + solver(a, b));
	}

	private static int solver(int[] a, int b) {
		int sumAll = 0;
		int sumTemp = 0;
		int minValue;
		int i = 0, j = a.length-1-b;
		for(int k = 0; k<a.length;k++)
		sumAll += a[k];
		int k;
		for(k = i;k<=j;k++)
			sumTemp +=a[k];
		minValue = sumTemp;
		i++;
		j++;
		while(j<a.length)
		{
			sumTemp += (a[j] - a[i-1]);
			minValue = Math.min(sumTemp, minValue);
			i++; j++;
		}
		return sumAll - minValue;
	}

}
