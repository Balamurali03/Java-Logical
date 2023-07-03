package com.logical.training;

public class Arraysortwithsingleloop {

	public static void main(String[] args) {
		
		int arr1[]= {2,1,4,3,8,0,6,5};
		for(int i=1;i<=arr1.length-1;i++)
		{
			if(arr1[i]<arr1[i-1])
			{ 
				arr1[i]=arr1[i]+arr1[i-1];
				arr1[i-1]=arr1[i]-arr1[i-1];
				arr1[i]=arr1[i]-arr1[i-1];
				i=0;
			}
			
		}
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i] +" ");
		}
		// TODO Auto-generated method stub

	}

}
