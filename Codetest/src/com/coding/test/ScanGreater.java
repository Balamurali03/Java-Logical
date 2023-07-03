package com.coding.test;

import java.util.Scanner;

public class ScanGreater {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" give numbers to be compared");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println("they are equal");
		}
		else 
		{
			System.out.println(" not equal");
		}
		
		
		System.out.println(" enter age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("can vote");
		}
		else 
		{
			System.out.println(" cant vote");
		}
		
		int arr[]=new int[4];
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(arr[0]-arr[1]-arr[2]-arr[3]==0)
		{
			System.out.println("they are equal");
		}
		else
		{
			System.out.println("they are not equal");
		}
		
		// TODO Auto-generated method stub

	}

}
