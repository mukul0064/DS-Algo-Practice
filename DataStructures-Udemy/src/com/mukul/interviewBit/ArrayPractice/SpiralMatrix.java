package com.mukul.interviewBit.ArrayPractice;

//Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//Example:
//
//Given the following matrix:
//
//[
//    [ 1, 2, 3 ],
//    [ 4, 5, 6 ],
//    [ 7, 8, 9 ]
//]
//You should return
//
//[1, 2, 3, 6, 9, 8, 7, 4, 5]
//
//Problem Approach :
//
//VIDEO : https://www.youtube.com/watch?v=siKFOI8PNKM


public class SpiralMatrix {

	public static void main(String[] args) {
		
		// input m*n matrix
		
		int[][] A = {{ 1, 2, 3 },
		             { 4, 5, 6 },
		             { 7, 8, 9 }};
		//calling solution
		spiralOrder(A);

	}

	private static void spiralOrder(int[][] a) {
		
		// size of row
		int row = a.length;
		// size of column
		int col = a[0].length;	
		// top to bottom initial start
		int T = 0;
		// bottom to top initial start
		int B = row-1;
		// left to right initial start
		int L = 0;
		// right to left initial start
		int R = col-1;
		// dir 0,1,2,3 = right,bottom,left and top direction travel respectively.
		int dir = 0;
		
		while(L<=R && T<=B) {
			// travelling right
			if(dir == 0) {
				for(int k = L; k<=R;k++)
					System.out.print(a[T][k]);
				T++;
			}
			// travelling bottom
			else if(dir == 1) {
				for(int k = T; k<=B; k++)
					System.out.print(a[k][R]);
				R--;
			}
			// travelling left 
			else if(dir == 2) {
				for(int k = R;k>=L;k--)
					System.out.print(a[B][k]);
				B--;
			}
			// travelling top
			else if(dir == 3) {
				for(int k = B;k>=T;k--)
					System.out.print(a[k][L]);
				L++;
			}
			// changing direction as per need (you can also remove this and set direct in every if statement too.
				dir = (dir+1)%4;
		}
	}

}
