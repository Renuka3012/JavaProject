package com.renu;

public class Static_Concept {
	
	

		

 String name ="Renuka";
		
		public static int m1(int a, int b){
			//System.out.println("hiiii");
			//return
					int c=2+3;
					System.out.println(c);
					return c;
		}
		
		
		public static void m2(){
			System.out.println("heello");
		}
		static {
			System.out.println("dear");
		}
	
	
	
	
public static void main(String[] args) {
	
	Static_Concept a = new Static_Concept();
	System.out.println(a.name);
 
	
	
	m1(5,3);
}
	
	
	 
	
	

}
