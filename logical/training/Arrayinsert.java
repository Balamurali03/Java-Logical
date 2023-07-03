package com.logical.training;

public class Arrayinsert {

	public static void main(String[] args) {
		int []arr1= {1,2,3,4,5};
		int []arr2=  {6,7,8};
		int index=3;
		int []res=new int[index+arr2.length];
		for(int i=0;i<=res.length-1;i++)
		{
			if(i>=index&&i<arr2.length+index)
			{
				res[i]=arr2[i-index];
			}
			else if(i<index)
			{
			res[i]=arr1[i];
			}
			
		}
		for(int i=0;i<=res.length-1;i++)
		{
		System.out.print(res[i]);
		}
		// TODO Auto-generated method stub

	}

}
