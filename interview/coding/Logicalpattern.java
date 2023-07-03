package com.interview.coding;

//import java.util.Scanner;

public class Logicalpattern
{
		public static void check(int n)
		{
		int n2=2;
		int secondnear=0;
		int temp=n;
		int sum=0;
		while(n>0)
		{
		int count=0;
		for(int i=2; i<n; i++)
		{
		if(n%i==0)
		{
		count++;
		}
		}

		if(count==0)
		{
		break;
		}

		n--;

		}
		while(n2<n)
		{
		int count2=0;
		for(int j=2; j<n2; j++)
		{
		if(n2%j==0)
		{
		count2++;
		}
		}
		if((count2==0||n2==2))
		{
		if(n+n2>temp)
		{
		sum=n+secondnear;
		break;
		}

		 secondnear=n2;
		}
		n2++;
		}
		System.out.print("number: "+temp);
		if(n!=0 && secondnear!=0)
		{
		System.out.print(" no.of moves: 2("+n+", "+secondnear+") ");
		}
		else
		{
		System.out.print(" no.of moves: 1("+n+") ");

		}
		if(sum==temp)
		{
		System.out.println("residual is: 0");
		}
		else
		{
		System.out.println("residual is: "+(temp-sum));

		}
		}

		
	
	

	public static void main(String[] args) {
		
			check(55);
			check(80);
			check(100);
			check(58);
			}
	
		
		// TODO Auto-generated method stub

	}


