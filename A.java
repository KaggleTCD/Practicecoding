package com.wordsearch;

public class A {

	public static void main(String[] args) {
		double target = 1000000.0;
		double result = (Math.log(target)/Math.log(2))+1;
		//System.out.println(result);
		//System.out.println(Math.pow(2.0, (result-1)));
		if(Math.pow(2.0, (result-1))<target) {
			System.out.println("Required no of days = "+(int)(result+1));
		}
		else {
			System.out.println("Required no of days = "+(int)result);
		}
		
		String a ="aaa";
		System.out.println(a.charAt(0)==a.charAt(1));

}
}
