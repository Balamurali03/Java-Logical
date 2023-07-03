package com.java.codetest1;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("the elements are");
		for(int i=0;i<=n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<=n-1;i++)
		{
			if(i+1<=n-1&&arr[i]<arr[i+1])
			{
				count++;
			}
		}
		if(count==n-1)
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
