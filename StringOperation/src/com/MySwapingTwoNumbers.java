package com;

public class MySwapingTwoNumbers 
{ 
	public static void main(String a[])
	{ 
		int x = 10; 
		int y = 20; 
		System.out.println("Before swap:"); 
		System.out.println("x value: "+x); 
		System.out.println("y value: "+y); 
		
		x = x+y; //10=10+20=30
		y=x-y; //20=30-20=10
		x=x-y; //30=30-10=20
		
		System.out.println("After swap:"); 
		System.out.println("x value: "+x); 
		System.out.println("y value: "+y); 
	} 
} 