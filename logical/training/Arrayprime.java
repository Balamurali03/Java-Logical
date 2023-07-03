package com.logical.training;

public class Arrayprime {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int num=0;
			for(int j=2;j<arr[i];j++)
			{
			if(arr[i]%j==0)
			{
				num++;
			}	
			}
			if(num==0)
			{
				System.out.println("the given number in the array is prime" + arr[i]);
			}
			else
			{
				System.out.println("the given number in the array is not a prime" + arr[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
