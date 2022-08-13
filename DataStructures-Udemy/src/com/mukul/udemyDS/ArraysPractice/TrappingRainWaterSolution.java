package com.mukul.udemyDS.ArraysPractice;

public class TrappingRainWaterSolution {
	
	//it has o[N] running complexity (with additional o(N) memory complexity
	//dynamic programming approach - memoiation !!!
	//
	//In programming, memoization is an optimization technique that makes applications more efficient and hence faster. 
	//It does this by storing computation results in cache, and retrieving that same information from the cache the next time it's needed instead of computing it again.
	public int solve(int [] heights) {
		int result = 0;
		// less than 3 bars cannot trap water
		if(heights.length < 3)
			return result;
		
		// calculate maximum right and maximum left values array
		int[] leftMax = new int[heights.length];
		int[] rightMax = new int[heights.length];
		

		// the left max if always 0 by defination
		leftMax[0] = 0;
		for(int i = 1; i< heights.length; ++i)
			// calculate maximum left values from left to right
			leftMax[i] = Math.max(leftMax[i-1], heights[i-1]);
			
		// the right max if always 0 by defination
		rightMax[heights.length-1] = 0;
		for(int i = (heights.length-2); i>=0; --i)
			//calculate right max value from right to left
			rightMax[i] = Math.max(rightMax[i+1], heights[i+1]);
		
		//calculate trapping water
		//creating array for trapping water
		
//		int[] water = new int[heights.length];
//		water[0] = 0;
//		water[heights.length-1] = 0;
//		for(int i = 1;i< heights.length-1;++i) {
//			if(Math.min(leftMax[i], rightMax[i]) < heights[i])
//				water[i] = 0;
//			else 
//				water[i] = Math.min(leftMax[i], rightMax[i]) - heights[i];
//		}
//		for(int i : water)
//		{
//			result = result + i;
//		}
		
		for(int i = 1; i<heights.length-1; ++i)
			if(Math.min(leftMax[i], rightMax[i])>heights[i])
				result += Math.min(leftMax[i], rightMax[i]) -heights[i];
		
		return result;
	}

}
