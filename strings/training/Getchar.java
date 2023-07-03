package com.strings.training;

import java.util.Scanner;

public class Getchar {
 
	public static void getchat(String s1,int n)
	{
		char c=s1.charAt(n);
		System.out.println("the character in the giver index is" + " "+ c);
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1= sc.next();
		System.out.println("enter the index");
		int n=sc.nextInt();
		
		getchat(s1,n);
		// TODO Auto-generated method stub

	}

}
