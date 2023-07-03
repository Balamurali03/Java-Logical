package com.logical.training;

public class Newprogram {
	public static void triangle(int n)
	{ 

		 int  i, j, space = 1;
	  
	     space = n - 1;
	     for ( j = 1; j <= n; j++) 
	     {
	    	 int count=0;
	    	 
	         for ( i = 1; i <= space; i++) 
	         {
	             System.out.print(" ");
	         }
	         space--;
	         int count1=1;
	         for (i = 1; i <= 2 * j - 1; i++) 
	         {
	        	
	        	 if(i==j)
	        	 {
	        		 System.out.print(2*j-1);
	        	 }
	        	 else if(j>i)
	        	 {
	        		 System.out.print(j+count);
	        		 count++;
	        	 }
	        	 else if(i==2*j-1)
	        	 {
	             System.out.print(j);
	             
	        	 }
	        	 else 
	        	 {
	             System.out.print(2*j-1-count1);
	             count1++;
	             
	        	 }
	         }
	         System.out.println("");
	     }
	}

	public static void main(String[] args) {
		triangle(5);
		// TODO Auto-generated method stub

	}

}
