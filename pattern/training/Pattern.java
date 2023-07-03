package com.pattern.training;

public class Pattern {
	public static void star(int m,int n)
	{
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
	}
	public static void mnum(int m,int n)
	{
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
	}
	public static void nnum(int m,int n)
	{
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
	}
	public static void num(int m,int n)
	{int k=1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
	}
	public static void alphabet(int m,int n)
	{ char a='a';
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
	}
	public static void alphabet1(int m,int n)
	{ 
		for(int i=1;i<=m;i++)
		{char a='a';
			for(int j=1;j<=n;j++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
	}
	public static void main(String[] args) {
		star(3,3);
		mnum(3,3);
		nnum(4,3);
		num(3,3);
		alphabet(3,3);
		alphabet1(3,3);
		// TODO Auto-generated method stub

	}

}
