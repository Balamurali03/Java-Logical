package com.logical.training;

public class Primenumber {
           public static void prime(int num)
           {
        	  int count=0;
        	  for(int i=2;i<=num-1;i++)
        	  {
        		  if(num%i==0)
        		  {
        			  count++;
        		  }
        	  }
        	  if(count==0) {
        	  System.out.println("it is a prime number");
           }
           else
           {
        	   System.out.println("it is not a prime number");
           }
           }
	public static void main(String[] args) {
		prime(5);
		prime(10);
		// TODO Auto-generated method stub

	}

}
