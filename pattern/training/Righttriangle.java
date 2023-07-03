package com.pattern.training;

public class Righttriangle {
	public static void rtri(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		}
		public static void invrtri(int a)
		{
			for(int i=a;i>=1;i--)
			{
				for(int j=i;j>=1;j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------");
	}
		public static void ltri(int a)
		{
			for(int i=1;i<=a;i++)
			{
				for(int j=i;j<a;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		
		rtri(4);
		invrtri(4);
		ltri(4);
		// TODO Auto-generated method stub

	}

}
