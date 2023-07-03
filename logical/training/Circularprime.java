package com.logical.training;

public class Circularprime {
	public static void circleprime(int num)
	{
		int count1=0;
		int pow=1;
		int num1=num;
		int count=0;
		while(num1>0)
		{
			num1=num1/10;
			count++;
		}
		//System.out.println(count);
		for(int i=1;i<count;i++)
		{
			pow=pow*10;
		}
		for(int i=1;i<=count;i++)
		{
			int rem=num%10;
			num=num/10;
			num=(rem*pow)+num;
			if(num%2 !=0)
			{
				count1++;
			}
		}
		if(count==count1)
		{
			System.out.println(num +" it is a circular prime");
		}
		else
		{
			System.out.println(num +" it is not a circular prime");
		}
		System.out.println("-------------------------------------------------------");
	}
	
		public static void circleprime1(int num)
		{
		
			int pow=1;
			int num1=num;
			int count=0;
			while(num1>0)
			{
				num1=num1/10;
				count++;
			}
			//System.out.println(count);
			for(int i=1;i<count;i++)
			{
				pow=pow*10;
			}
			for(int i=1;i<=count;i++)
			{
				int rem=num%10;
				num=num/10;
				num=(rem*pow)+num;
				if(num%2 !=0)
				{
					System.out.println(num +" it is a  prime");
				}
				else
				{
					System.out.println(num +" it is not a  prime");
				}
			}
		}

	public static void main(String[] args) {
		
		circleprime(79);
		circleprime1(896);
		
		// TODO Auto-generated method stub

	}

}
