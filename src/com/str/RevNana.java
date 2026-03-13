package com.str;

public class RevNana {
	
	public static void main(String[] args) {
		
		String name="sappa kondalarao";
		
		String rev="";
		
       String[] name1=name.split(" ");		
		for (String string : name1) {
			for (int i = string.length()-1; i >=0; i--) {
				rev=rev+string.charAt(i);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}

}
