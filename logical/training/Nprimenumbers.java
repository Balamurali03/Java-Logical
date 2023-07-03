package com.logical.training;

public class Nprimenumbers {
	public static void nprime(int num)
	{
		for(int i=2;i<=num;i++)
		{
			int count=0;
      	  for(int j=2;j<=i-1;j++)
      	  {
      		  if(i%j==0)
      		  {
      			  count++;
      		  }
      	  }
      	  if(count==0) {
      	  System.out.println(i +" is a prime number");
         }
		}
	}

	public static void main(String[] args) {
		nprime(50);
		// TODO Auto-generated method stub

	}

}
