package com.coding.test;

public class StringStr {

	public static void main(String[] args) {
		
		
		StringBuffer s=new StringBuffer("ABDEF");
		StringBuffer s1=s.reverse();
    	String s2="";
		for(int i=0;i<s.length();i++)
		{
			char a=s1.charAt(i);
			int x=a+1;
		   char c=(char)x;  
		   s2=s2+c;
			
		}	
		System.out.println(s2);
		// TODO Auto-generated method stub

	}

}
