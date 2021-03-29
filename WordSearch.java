package com.wordsearch;

public class WordSearch {
	
	public static void main(String args[]) {
		
		char [][] wordArray = new char[2][2];
		int rows=wordArray.length;
		int columns=wordArray[0].length;
		wordArray[0][0]='A';
		wordArray[0][1]='B';
		wordArray[1][0]='C';
		wordArray[1][1]='D';
		
		String wordToBeSearched = "ABC";
		int index = 0;
		boolean ifPresent = false;
		boolean isWordPresent=false;
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<columns;j++) {
				if(wordArray[i][j]==wordToBeSearched.charAt(0)&&searchWord(wordArray,wordToBeSearched,0,i,j)) {
				ifPresent = true;
				break;
				
			}
		}
			if(ifPresent) {
				System.out.println("Present");
				break;
			}
			else {
				System.out.println("Not present");
			}
	}
	}

	private static boolean searchWord(char[][] wordArray, String wordToBeSearched, int index, int i, int j) {
		if(index==wordToBeSearched.length()) {
			return true;
		}
		if(i<0||j<0||i>=wordArray.length||j>=wordArray.length||wordArray[i][j]!=wordToBeSearched.charAt(index))
		{
			return false;
		}
		char temp=wordArray[i][j];
		wordArray[i][j]=' ';
		boolean found = searchWord(wordArray,wordToBeSearched,index+1,i+1,j)||
				searchWord(wordArray,wordToBeSearched,index+1,i-1,j)||
				searchWord(wordArray,wordToBeSearched,index+1,i,j+1)||
				searchWord(wordArray,wordToBeSearched,index+1,i,j-1);
		wordArray[i][j] = temp;
		return found;
		
	}

}
