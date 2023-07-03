package com.logical.training;

public class Sumwithoutarithmetic {
	public static int sum(int a,int b)
	{
		 while (b != 0)
		    {
		         int carry = a & b;
		       //  System.out.println(carry);
		        a = a ^ b;
		// System.out.println(a);
		        b = carry << 1;
		      //  System.out.println(b);
		    }
			
		    return a;
		}
	
	public static void main(String[] args) {
		System.out.println(sum(5,3));
	
		// TODO Auto-generated method stub

	}

}
