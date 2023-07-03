package com.strings.training;

public class Removeduplicates {

	public static void main(String[] args) {
		
		int arr[]= {2,4,2,4,1,1,6,8,7,5,6,5};
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						arr[j]=0;
					}
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(arr[i] +" ");	
			}
			
		}
		
		// TODO Auto-generated method stub

	}

}
