package com.mukul.udemyDS.ArraysPractice;

import java.util.Arrays;

//Trapping rain water problem overview
//Given n non-negative integers representing an elevation map where the width of each bar is 1. Compute how much water it can trap after raining!
//
//Here the elevation map (the input for the algorithm) is [4,1,3,1,5] and the output is the total units of trapped rain water - which is 7.
//
//Good luck!
//
//***check the word file for the questions of array if more understanding is needed with diagrams***

public class TrappingRainWater {

	public static void main(String[] args) {
		
		//Given array is
		int[] n = {1, 0, 2, 1, 3, 1, 2, 0, 3};
		System.out.println("Given height is :" + Arrays.toString(n));
		//Some extra lines for better visual
		System.out.println();
		// Water that can be trapped solution:
		TrappingRainWaterSolution t = new TrappingRainWaterSolution();
		System.out.println("Trapped Water value is :" + t.solve(n));		
	}

}
