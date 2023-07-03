package com.java.codetest1;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
System.out.println("enter the string");

		String s1=sc.next();
		String s2="";
		String s3="";
		
		int n=s1.length();
		if(n<2)
		{
			
			System.out.println(s1);
		}
		else if(n==2)
		{
			
			s2=s2+s1+s1+s1;
			System.out.println(s2);
		}
		else
		{
		
			s3=s3+s1.substring(0, 2);
			
			s2=s2+s3+s1+s3;
			System.out.println(s2);
		}
		// TODO Auto-generated method stub

	}

}
