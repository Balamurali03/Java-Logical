package com.logical.training;

public class Primefactor {
	public static void primefac(int num)
	{
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				System.out.println("prime factor of num is " + i);
			}
		}
	}

	public static void main(String[] args) {
		primefac(35);
		// TODO Auto-generated method stub

	}

}
