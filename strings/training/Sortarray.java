package com.strings.training;

public class Sortarray {

	public static void main(String[] args) {
		
		int arr[]= {2,1,4,3,8,0,6,5};
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]<arr[i-1])
			{ 
				arr[i]=arr[i]+arr[i-1];
				arr[i-1]=arr[i]-arr[i-1];
				arr[i]=arr[i]-arr[i-1];
				i=0;
			}
			
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i] +" ");
		}
		// TODO Auto-generated method stub

	}

}
