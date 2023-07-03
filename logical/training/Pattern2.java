package com.logical.training;

public class Pattern2 {
 
	public static void main(String[] args) {
		int a=0;
		 int b=1;
		 int count=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==(1+count)&&j==(5-count))
				{
					System.out.println(a);
					a=a+b;
					
				}
				else
				{
					System.out.println("  ");
				}
			}
			System.out.println();
			count++;
		}
		// TODO Auto-generated method stub

	}

}
