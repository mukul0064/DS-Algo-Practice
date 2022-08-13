package com.mukul.udemyDS.ArraysPractice;

//Palindrome problem overview
//"A Palindrome is a string that reads the same forward and backward"
//
//For example: radar or madam
//
//Your task is to design an optimal algorithm for checking whether a given string is palindrome or not! 
//
//Good luck!

public class Palindrome {

	public static void main(String[] args) {
//**Given String**
		String s = "radar";
		System.out.print("Given word is :" + s);			
//Giving some new lines for better visual
		System.out.println();
		System.out.println();
//**Check Palindrome or not by true or false	
		System.out.println("Given word is palindrome :");
//Giving some new lines for better visual
		System.out.println();
		System.out.println(PalindromeCheck(s));
	}


//	firstly create two integer variables for lower and higher index
//	use while loop to run as index/2 that is lower index < higher index
// 	check charAt lower with charAt upper index if not same return false
//	increment lower index in while loop
//	decrement higher index in while loop
// once the loop ends return true
	
	// The problem is almost same as that of reverse method of an array.
	//***Time Complexity is o(N) in worst and o(N/2) as best
	//***Space Complexity is same is earlier
	private static boolean PalindromeCheck(String s) {
		int lowerIndex = 0;
		int upperIndex = s.length()-1;
		while(lowerIndex < upperIndex)
		{
			if(s.charAt(lowerIndex) != s.charAt(upperIndex))
				return false;
			lowerIndex ++;
			upperIndex --;
		}
		return true;
	}

}
