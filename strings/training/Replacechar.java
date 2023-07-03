package com.strings.training;

import java.util.Scanner;

public class Replacechar {
	public static void replacecharindex(String s1,int n,String ch)
	{
		String str=s1;
	char [] arr= str.toCharArray();
	arr[n]=ch.charAt(0);
	str=arr.toString();
	
	System.out.println("the orginal string is"+" "+ s1);
	System.out.println("the modified string is"+" "+ str);
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		System.out.println("enter the index to change char");
		int n=sc.nextInt();
		System.out.println("enter the replacing  character ");
		String ch=sc.next();
		replacecharindex(s1,n,ch);
		// TODO Auto-generated method stub

	}

}
