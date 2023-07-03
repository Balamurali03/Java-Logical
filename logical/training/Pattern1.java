package com.logical.training;

public class Pattern1 {

	public static void main(String[] args) {
		int count=0;
		int a=1;
		int b=2;
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==1+count&&j==i) {
				System.out.print(a);
				a=a+b;
				}
				else if (j==9-count&&i==1+count)
				{
					System.out.print(b);
					b=a+b;
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
			count++;
			
		}
		// TODO Auto-generated method stub

	}

}
