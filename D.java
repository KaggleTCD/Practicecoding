package com.wordsearch;

import java.util.Arrays;

public class D extends C {
	public D() {
		System.out.println("D");
	}
	public void m1() {
		System.out.println("D method");
	}
	
	public static void main(String srgs[]) {
		C c = new D();
		c.m1();
		
		byte a = 127; byte b = 127;// b = a + b; 
		b += a;// error : cannot convert from int to byte b += a; // ok

		//Read more: https://javarevisited.blogspot.com/2015/10/133-java-interview-questions-answers-from-last-5-years.html#ixzz6fqfVmanX
	Object [] array = new Object[2];
	array[0] = 1;
	array[1] = 2;
	System.out.println(Arrays.toString(array));
	System.out.println(Arrays.deepToString(array));
	//System.out.println(Arrays.deepToString((Object [])array));
	for(Object arr:array) {
		System.out.println(arr);
	}
	}

}
