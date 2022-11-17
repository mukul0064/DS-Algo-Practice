package com.mukul.interviewBit.ArrayPractice;

/*Problem Description

You are in an infinite 2D grid where you can move in any of the 8 directions

 (x,y) to 
    (x-1, y-1), 
    (x-1, y)  , 
    (x-1, y+1), 
    (x  , y-1),
    (x  , y+1), 
    (x+1, y-1), 
    (x+1, y)  , 
    (x+1, y+1) 
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

NOTE: This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the �See Expected Output� section.



Input Format
Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.



Output Format
Return an Integer, i.e minimum number of steps.



Example Input
Input 1:

 A = [0, 1, 1]
 B = [0, 1, 2]


Example Output
Output 1:

 2


Example Explanation
Explanation 1:

 Given three points are: (0, 0), (1, 1) and (1, 2).
 It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).*/

public class MinStepsInfiniteGrid {

	public static void main(String[] args) {
		
		int[] A = {0,7,9};
		int[] B = {0,1,2};
		int result = coverPoints(A,B);
		System.out.println(result);
	}
	
    public static int coverPoints(int[] A, int[] B) {
        int size = A.length;
        int steps = 0;
        for(int i = 0; i<size-1;i++)
        {
            int x1 = A[i];
            int y1 = B[i];
            int x2 = A[i+1];
            int y2 = B[i+1];
            int diff_x = Math.abs(x1-x2);
            int diff_y = Math.abs(y1-y2);
            steps = steps + Math.max(diff_x, diff_y);
        }
        return steps;
    }

}