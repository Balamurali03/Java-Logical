package com.strings.training;

public class ReverseEachWordInSting {

	public static void main(String[] args) {
		String s1="hi hello world";
				
		StringBuffer s2=new StringBuffer("");
		
		int count=3;
		int count1=0;
		int n=s1.length();
		for(int j=0;j<count;j++)
		{
		for(int i=n;i>0;i--)
		{
			s2=s2.append(s1.charAt(i));
			
		}
		}
		
		System.out.println(s2);
		// TODO Auto-generated method stub

	}

}
