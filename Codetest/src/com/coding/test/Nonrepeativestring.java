package com.coding.test;

public class Nonrepeativestring {

	public static void main(String[] args) {
		
		String str="aaabbc";
		String s1="";
		char [] arr= str.toCharArray();
		char []arr1=new char[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{ 
				if(arr1[j]!=' ')
			{
				
				if(arr[i]!=arr1[j])
				{
					arr1[j]=arr[i];
					System.out.println(arr1[j]);
					break;
				}
			}
				
				
			}
			
		}
		
		//if(str.charAt(i)!=s1.charAt(i))
			
		System.out.println(s1);
		// TODO Auto-generated method stub

	}

}
