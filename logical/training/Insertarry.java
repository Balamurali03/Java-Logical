package com.logical.training;

public class Insertarry {

	public static void main(String[] args) {
		
		int []arr1= {1,2,3,4,5};
		int []arr2=  {6,7,8};
		int []res=new int[arr1.length+arr2.length];
		for(int i=0;i<=res.length-1;i++)
		{
			if(i>=2&&i<arr2.length+2)
			{
				res[i]=arr2[i-2];
			}
			else if(i<2)
			{
			res[i]=arr1[i];
			}
			else {
			res[i]=arr1[i-arr2.length];
			}
		}
		for(int i=0;i<=res.length-1;i++)
		{
		System.out.print(res[i]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
