package com.logical.training;

public class Pattern {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				if(i==2&&j==3)
				{
					System.out.print(i+j);
				}
				else if(i==2) {
					System.out.print(i+count);
					count++;
				}
				else {
				System.out.print(j);
				}
				
				
			}
			System.out.println();
			
		}
		// TODO Auto-generated method stub

	}

}
