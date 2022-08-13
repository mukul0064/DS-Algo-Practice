package com.mukul.udemyDS.ArraysPractice;

import java.util.Arrays;

public class EdsgerDijkstraSort {
	
	
// this will only contains the values (0, 1 and 2s)
	private int[] nums;
	
	public EdsgerDijkstraSort(int[] nums) {
	this.nums = nums;
	}
	
	public void solve() {
		
		int i = 0;
		int j = 0;
		// we know that the middle value is 1 (for 0, 1 and 2) that will be pivot
		int pivot = 1;
		int k = nums.length-1;
		
		// it has 0(N) linear running time complexity and no space is used.
		while(j<=k) {
			
			//when item at index j = 0
			if(nums[j] < pivot) {
				swap(i,j);
				i++;
				j++;
			} 
			//when item at index j = 2
			else if(nums[j] > pivot) {
				swap(j,k);
				k--;
			}
			//when item is 1 at index j
			else {
				j++;
			}
			
		}
	}
	
	private void swap (int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
	
	public void showResult() {
		System.out.println(Arrays.toString(nums));
		
	}

}
