package com.renu;

import java.util.Scanner;

import javax.management.StringValueExp;

public class Reverse_Integer {

	public static void main(String[] args)  
	{
		int num1 =123565;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer No:");
		 int num=sc.nextInt();
		
		int rev =0;
		while (num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		
		
		
		//String Buffeer
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		 
	}

}
