package com.coding.test;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int sum =0;
		int sum1=0;
		int sum2=0;
		int arr[]= {3,4,5,3,100,1,83,54,23,20};
		int n=arr.length;
		 Arrays.sort(arr);
		for(int i=0;i<=n-1;i++)
		{
			sum=sum+arr[i];
			System.out.print(arr[i] + " ");
		}
		int temp=sum/2;
		System.out.println(sum);
		System.out.println(temp);
		for(int i=0;i<=(n-1)/2;i++)
		{
			sum1=sum1+arr[i];
			//System.out.print(arr[i] + " ");
		}
		System.out.println(sum1);
		for(int i=((n-1)/2)+1;i<=(n-1);i++)
		{
			sum2=sum2+arr[i];
		}
		System.out.println(sum2);
		// TODO Auto-generated method stub
       int dif=sum2-sum1;
       System.out.println(dif);
       int dif1=dif-temp;
       System.out.println(dif1);
	}

}
