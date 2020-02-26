package com.renu;

class Aa{}
class Bb{}
class C{}
class D{}

public class Methods {
	
	
//	void m1(){
//		System.out.println("m1");
//		
//	}
//	
//	static void m2(){
//		
//		System.out.println("m2");
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		Methods.m2();//		
//		Methods a = new Methods();
//		a.m1();
//		
//	}
	
	void m1(Aa a,Bb b)
	{
		System.out.println("m1");
	}
	
	static void m2(C c, D d)
	{
		System.out.println("m2");
	}
	
	
	public static void main(String[] args) {
		
		
		Methods.m2(new C(), new D()); // two parameters
		
		Methods m = new Methods();
		 m.m1(new Aa(), new Bb()); // passing object directly here as parameters
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
