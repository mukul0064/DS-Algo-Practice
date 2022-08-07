package com.mukul.udemyDS.ArraysPractice;

import java.util.Arrays;

//Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not!
//
//"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"
//
//For example: "r e s t f u l" and "f l u s t e r" are anagrams.
//
//ignore case sensitivity

public class AnagramProblem {

	public static void main(String[] args) {
		
//Given Arrays
//		char[] s1 = {'r', 'e', 's', 't', 'f', 'u', 'l'};
//		char[] s2 = {'f', 'l', 'u', 's', 't', 'e', 'r'};
		String s1 = "RESTFUL";
		String s2 = "fluster";
		System.err.println("Given 2 words "+s1+" and "+s2+" are anagrams (true/false) :");
//Giving some new lines for better visual
		System.out.println();
//Checking whether given array of characters is anagrams or not? Giving result as boolean value of true or false
		System.out.println(Anagrams(s1,s2));
	}
//sort the letters of the 2 string or given 2 arrays
//o(NlogN) this is the "bottleneck" of the algorithm
//we have to compare all the letters of the 2 arrays one by one
//o(N) for the for loop but overall time complexity is o(N) + o(NlogN) = o(NlogN)
//o(N) is better than o(NlogN)
//considering space if given as strings then converting it character array stores it else no extra space usage
	
	private static boolean Anagrams(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i = 0; i<c1.length; i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}

}
