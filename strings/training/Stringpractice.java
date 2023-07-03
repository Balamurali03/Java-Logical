package com.strings.training;

public class Stringpractice {

	public static void main(String[] args) {
		int count=0;
		int count1=0;
		String str="balamurali31@1997@gmail.com";
	if(	str.contains("@"))
	{
		count++;
	}
	if(	str.contains("."))
	{
		count1++;
	}
	if(count==1&&count1==1)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	
	
	
	String str1="balamurali03101997@gmail.com";
	

	
	if(str1.matches("@")&&str1.matches("."))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
		// TODO Auto-generated method stub

	}

}
