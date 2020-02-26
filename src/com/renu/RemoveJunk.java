package com.renu;

public class RemoveJunk {

	public static void main(String[] args)
	{
		
		String s= "@#$%%5^^%^&%$#$#$Renuka(**^&^$##((*&&^%%$>?>ShivaH";
		String y=s.replaceAll("[^a-zA-Z0-9]", "*");
		System.out.println(s);
		System.out.println(y);
		
		
	}

}
