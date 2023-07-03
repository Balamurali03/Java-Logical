package com.logical.training;

import java.util.Arrays;


public class Arraysort {

	public static void main(String[] args) {
		System.out.println("the array sorted in acending");
		int arr[]= {2,1,4,3,8,0,6,5};
		 Arrays.sort(arr);
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			for(int j=i;j<=arr.length-1;j++)
//			{
//				if(arr[i]>arr[j])
//				{ int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------------------");
		
		int arr1[]= {2,1,4,3,8,0,6,5};
		System.out.println("the array sorted in decending");
		 Arrays.sort(arr1);
		
//		for(int i=0;i<=arr1.length-1;i++)
//		{
//			for(int j=i;j<=arr1.length-1;j++)
//			{
//				if(arr1[i]<arr1[j])
//				{ 
//					int temp=arr1[i];
//					arr1[i]=arr1[j];
//					arr1[j]=temp;
//				}
//			}
//		}
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i] +" ");
		}
		// TODO Auto-generated method stub

	}

}
