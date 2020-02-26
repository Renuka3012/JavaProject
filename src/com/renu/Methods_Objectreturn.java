package com.renu;

public class Methods_Objectreturn {
	
	int a=122, b=890, c=200;
	Methods_this m1(){
		System.out.println("m1 ");
		return new Methods_this();
		
	}
	static Static_Concept m2(){
		System.out.println(" hello static");
		return new Static_Concept();
	}
	
	void m3(int a, int b){
		
		System.out.println(a+b);
		System.out.println(this.a + this.b);
				
	}
	
	String m4(){
		
		System.out.println("Shiva");
		return "String";
		
	}
	
	
	Methods_Objectreturn m5(){
		
		System.out.println(".................");
		
		return this; // current class return type can be used by this keyword
		
		
	}
	int m5(int a, int b){
		System.out.println(a+b);
		return a+b;
		
	}
	int m5(int a,int b,int c){
		System.out.println(this.a +this.b + this.c);
		return (this.a +this.b + this.c);
	}
	
	int m6()
	{
		return  a;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Methods_Objectreturn by = new Methods_Objectreturn();
		
//		
	by.m1();
	by.m2();  // return type class name (static) and am calling not by class name but by object created by present class(by) and default static block executes....
	
Methods_Objectreturn.m2();
	by.m3(300, 200);
	by.m4();
	by.m5();
int m5=by.m5(20, 30);
int	m6=by.m6();
	int m7=by.m5(310, 0231, 523);
	
	
		
		
		
	}
	

}
