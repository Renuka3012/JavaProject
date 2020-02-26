package com.renu;

public class Methods_this {
	
	
	int a=1000; // instance
	int b=3000;
	int c=100;
	static  void m1(int x,int y){ // local 
		 
		 
		 // int x,y;
		  
		// System.out.println(this.x+this.y); // instance
		 
		 System.out.println(x+y);
	 }
	int m5(int a, int b){
		System.out.println(a+b);
		return a+b;
		
	}
	int m5(int a,int b,int c){
		return (this.a +this.b + this.c);
	}
	
	int m6()
	{
		return  a;
	}
	 public static void main(String[] args) {
		Methods_this ab = new Methods_this();
		ab.m1(100,200);// local
		
		ab.m5(20, 30);
	}

}
