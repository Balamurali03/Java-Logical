package com.pattern.training;

public class Triangle {
	public static void tri(int n)


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
	             System.out.print("*");                
	         }
	         System.out.println("");
	     }
	}
	public static void main(String[] args) {
		tri(4);
		// TODO Auto-generated method stub

	}

}
