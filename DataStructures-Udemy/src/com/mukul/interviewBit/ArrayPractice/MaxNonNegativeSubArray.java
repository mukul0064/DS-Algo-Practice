package com.mukul.interviewBit.ArrayPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//Problem Description:
//
//Given an array of integers, A of length N, find out the maximum sum sub-array of non negative numbers from A.
//The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
//Maximum sub-array is defined in terms of the sum of the elements in the sub-array.
//Find and return the required subarray.
//
//NOTE:  
//If there is a tie, then compare with segment's length and return segment which has maximum length.
//If there is still a tie, then return the segment with minimum starting index.
//
//
//Problem Constraints
//1 <= N <= 105
//-109 <= A[i] <= 109
//
//Input Format
//The first and the only argument of input contains an integer array A, of length N.
//
//Output Format
//Return an array of integers, that is a subarray of A that satisfies the given conditions.
//
//Example Input
//Input 1:
// A = [1, 2, 5, -7, 2, 3]
//Input 2:
// A = [10, -1, 2, 3, -4, 100]
//
//Example Output
//Output 1:
// [1, 2, 5]
//Output 2:
// [100]
//
//Example Explanation
//Explanation 1:
// The two sub-arrays are [1, 2, 5] [2, 3].
// The answer is [1, 2, 5] as its sum is larger than [2, 3].
//Explanation 2:
// The three sub-arrays are [10], [2, 3], [100].
// The answer is [100] as its sum is larger than the other two.

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		int[] A = {1967513926, 1540383426, -1303455736, -521595368};
		int[] result = maxset(A);
		System.out.println("Result of max non negative Array is: "+ Arrays.toString(result));
	}

	private static int[] maxset(int[] A) {
		int n = A.length;
		int i=0,maxm=0,count=0,start=0,end=-1;
	    int fstart=-1,fend=-1;
	    long sum=0,maxsum=0;
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    while(i<n){
	        if(A[i]>=0){
	            sum+=A[i];
	            count++;
	            end++;
	        }
	        if(sum>maxsum){
	            maxsum=sum;
	            fstart=start;
	            fend=end;
	        }
	        else if(sum==maxsum&&count>maxm){
	            maxm=count;
	            fstart=start;
	            fend=end;
	        }
	        if(A[i]<0){
	            count=0;
	            start=i+1;end=i;
	            sum=0;
	        }
	        i++;
	    }
	    int k = 0;
	    if(fstart!=-1&&fend!=-1){
	        for(int j=fstart;j<=fend;j++)
	         res.add(A[j]);
	    }
	    int[] result = new int[res.size()];
	    int b = 0;
	    for(int r : res)
	    {
	    	result[b] = r;
	    	b++;
	    }
	    return result;
	}

}
