package com.wordsearch;

public class Palindrome {

	public static void main(String[] args) {
		String str = "aacabdkacaa";
		String largestPalindrome = "";
		String tempPalindrome = "";
		for(int i =0;i<str.length();i++) {
			tempPalindrome=checkPalindrome(str,i,i);
			if(tempPalindrome.length()>largestPalindrome.length()) {
				largestPalindrome=tempPalindrome;
			}
			tempPalindrome=checkPalindrome(str,i,i+1);
			if(tempPalindrome.length()>largestPalindrome.length()) {
				largestPalindrome=tempPalindrome;
			}

		}
		System.out.println(largestPalindrome);

	}
	private static String checkPalindrome(String str,int i,int j) {
		String currentPalindrome = "";
		while(i>=0 && j<str.length()) {
			if(str.charAt(i)==str.charAt(j)) {
				currentPalindrome=str.substring(i,j+1);
			}
			else {
				break;
			}
			i--;
			j++;
		}
		return currentPalindrome;
	}

}
