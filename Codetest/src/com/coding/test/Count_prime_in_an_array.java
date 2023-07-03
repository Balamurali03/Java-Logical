package com.coding.test;

public class Count_prime_in_an_array {

	public static void main(String[] args) {
		
		
		int arr[]= {2,3,4,5,6,7,8,9,11,21,54,31};
		
		int count1=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			int a=arr[i];
			int count=0;
			if(a==2)
			{
				count1++;
			}
			
			for(int j=2;j<a;j++)
			{
				if(a%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				count1++;
			}
		}
		System.out.println("the no of prime numbers in the array is  "+ count1);
		// TODO Auto-generated method stub

	}

}
