package com.coding.test;

public class Left_shift_zeros {

	public static void main(String[] args) {
		int k=0;
		int arr[]= {1,0,0,2,0,0,3};
		for(int j=0;j<=k;j++)
		{ 
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]!=0)
				{
					k++;
				}
				if(i+1<=arr.length-1)
				{
					if(arr[i]!=0&&arr[i+1]==0)
					{
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
			}
			
				
				
			}
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i] +" ");
		}
		// TODO Auto-generated method stub

	}

}
