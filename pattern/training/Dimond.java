package com.pattern.training;

public class Dimond  {
	

	public static void diamond(int n)
	{
		 int  i, j, space = 1;
	     
	     space = n - 1;
	     for ( j = 1; j <= n; j++) 
	     {
	         for ( i = 1; i <= space; i++) 
	         {
	             System.out.print(" ");
	         }
	         space--;
	         for (i = 1; i <= 2 * j - 1; i++) 
	         {
	             System.out.print(j);                
	         }
	         System.out.println("");
	     }
	     space = 1;
	     for (j = 1; j <= n - 1; j++) 
	     {
	         for (i = 1; i <= space; i++) 
	         {
	             System.out.print(" ");
	         }
	         space++;
	         for (i = 1; i <= 2 * (n - j) - 1; i++) 
	         {
	             System.out.print(n+j);
	         }
	         System.out.println("");
	     }
	}
	

	public static void main(String[] args)
	{
		diamond(5);
	}
}