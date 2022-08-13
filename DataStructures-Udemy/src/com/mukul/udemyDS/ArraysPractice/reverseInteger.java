package com.mukul.udemyDS.ArraysPractice;

//Integer reversion problem overview
//Your task is to design an efficient algorithm to reverse a given integer. For example if the input of the algorithm is 1234 then the output should be 4321.
//
//NOTE: the input is an integer (and not a string) !!!
//
//Good luck!

public class reverseInteger {

	public static void main(String[] args) {

		//**Given integer**
		int n =1002;
		System.out.println("Given integer is :"+n);
		//Giving some new lines for better visual
		System.out.println();
		//**Reverse integer Method
		int N = reverseInteger(n);
		System.out.println("Reverse of the integer passed is :"+N);
	}
	
	// calculate the remainder of the number by %10
	// short the number last digit by /10
	// store the number in temp value, make sure to increase the temp value to *10 first to make number of same type
	
	// o(N) linear running time complexity
	private static int reverseInteger(int n) {
		int temp = 0;
		while(n>0)
		{
			temp = (temp*10) + (n%10);
			n = (n/10);
		}
		return temp;
	}
}


