package com.logical.training;

public class Nunofdigit {
	public static void test(int num)
	{ int count=0;
		for(int r=1;r<=99;r++)
		{ int i=r;
			while(i>0)
			{
				int j=i%10;
				
				if(num==j)
				{
				count= count+1;
				}
				i=i/10;
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		test(3);
		// TODO Auto-generated method stub

	}

}
