package com.strings.training;

public class Numberpalindrome {

	public static void main(String[] args) {
		
		
		int num=121;
		int num1=num;
		int sum=0;
		while(num1>0)
		{int rem=0;
		rem=num1%10;
		sum=(sum*10)+rem;
			num1=num1/10;	
		}
		if(sum==num)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	
		
		// TODO Auto-generated method stub

	}

}
