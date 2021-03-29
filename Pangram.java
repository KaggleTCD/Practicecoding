package com.wordsearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		Set<Character> alphabets = new HashSet<>();

		
		String wordPangram  = "AbC DEFghiJ KLmnOPQR STUVwx yz";
		String wordNotPangram = "AbC DEFghiJ KLmnOPQR Sx yz";
		wordPangram = wordPangram.toLowerCase();
		wordNotPangram = wordNotPangram.toLowerCase();
		for(int i=0;i<wordNotPangram.length();i++) {
			if(wordNotPangram.charAt(i)!=' ')
			alphabets.add(wordNotPangram.charAt(i));
		}
		long count = alphabets.stream().count();
		if(count==26l) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not pangram");
		}

	}

}
