package com.logical.training;

public class Palindrome {
	public static void palindrome(int num)
	{     int sum=0;
	int rem;
	int fake=num;
		while(fake>0)
		{
			rem=fake%10;
		sum=(sum*10)+rem;
		fake=fake/10;	
			
		}
		if(num==sum)
		{
			System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the given number is not palindrome");
		}
	}

	public static void main(String[] args) {
		palindrome(1221);
		palindrome(121);
		palindrome(12213);
		palindrome(22022022);
		palindrome(2024);
		
		// TODO Auto-generated method stub

	}

}
