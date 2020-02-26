package com.renu;
class A{	
	
	 public void m1(){
		 System.out.println("hiii");
	 
	 }
	 
	 public int m1(int i){
		 return i;
	 }
	 
	
}
	 
	 
	 class B extends  A{
		 public void m1(){
			 System.out.println("hello");
			 
			
		 }
		
		 
		 
		 public int m1(int j){
			 return j;
		 }
	 

public static  class Polymorphism { //
	
	 

	public static  void main(String[] args) 
	{
		 
			// class A = new class A();
		A a= new A();
		 a.m1();
		 
		 B b= new B();
		   b.m1();
		   
		   A c = new B();
		   c.m1();
		   
		  // B d = new A();
		 
			 
		}


	}

}
