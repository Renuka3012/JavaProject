package project1;

 class one{
	 public static void m1(){
		System.out.println("in one class m1 method");
		
	}
	 
	 
	 void m2(){
		 System.out.println("gjhj");
	 }
}

class two extends one
{
	public static void m1() 
	{
		System.out.println("two");
	} 
	
	 void m2(){
		System.out.println("three");
	}
}

 

public class overriding {

	public static void main(String[] args) {
		
		one t = new two();
		two o = new two();
		// t.m1();
		// o.m1();
		 //.m2();
		 //t.m2();
		 t.m1();
		 t.m2();o.m2();
		 o.m1();
		 
	}

}
