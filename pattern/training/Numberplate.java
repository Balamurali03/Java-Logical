package com.pattern.training;

public class Numberplate {
	public static int number(int num)
	{int dig=0;
		while(num>0)
		{
			int res=num%10;
			dig=dig+res;
			num=num/10;
		}
		num=dig;
		//System.out.println(dig);
		if(num==1)
		{
			System.out.println(dig +"it is lucky number");
		}
		else if(num>1&&num<=9)
		{
			System.out.println(dig +"it is not a lucky number");
		}
		else
		{
			return number(num);
		}
		return 0;
	}
	

	public static void main(String[] args) {
		number(5678);
		// TODO Auto-generated method stub

	}

}
