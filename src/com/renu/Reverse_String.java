package com.renu;

public class Reverse_String {
	public static void main(String[] args) {
		
		String s="Renuka";
		String rev="";
		 
		
		 int len=s.length();
		 System.out.println(len);
		 
		 for(int i=len-1;i>=0;i--)
		 {
			rev =rev+s.charAt(i) ;// which returns char and append single char to rev variable
		 }
		 System.out.println(rev);
		 
		 s="Renuka Mohan";// string is immutable hence it doesnt overwrite string value
		 
		 
		 StringBuffer sb = new StringBuffer(); // mutable class
		 
		 
		 sb.append(s);
		 
		 sb.reverse();
		 System.out.println(sb);
		 
		 
		 
		 
		 
		 
		
	}

}
