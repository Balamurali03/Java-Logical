package com.strings.training;

public class Frequencyofeachchar {

	public static void main(String[] args) {
		
		String str="balamuralirudra";
	char arr[]=	str.toCharArray();
	for(int i=0;i<=arr.length-1;i++)
	{
		int count=0;
		for(int j=i;j<=arr.length-1;j++)
		{   
		   if(arr[i]==arr[j])
		   {
			   count++;
		   }
			   
		}
		System.out.println("the frequency of "+arr[i] +" is :" + count);
	}
		// TODO Auto-generated method stub

	}

}
