package com.strings.training;

import java.util.Arrays;

public class Stringpractice1 {

	public static void main(String[] args) {
		String s1="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)";
		String s2="is";
		String s3="";
		int n= s1.length();
		char arr[]=s1.toCharArray();
		int n1=arr.length;
		for (int i=0;i<=n1-1;i++)
		{
			if(i-1>=0&&i+2<=n1-1&&i+1<=n1-1&&arr[i-1]==' '&&arr[i]=='i'&&arr[i+1]=='s'&&arr[i+2]==' ')
			{
				arr[i]=' ';
				arr[i+1]=' ';
			}
		}
//		s3=Arrays.toString(arr);
//		System.out.println(s3);
		StringBuffer s4=new StringBuffer();
//		for (int i=0;i<=n1-1;i++)
//		{
		  s4=s4.append(arr);
		  System.out.println(s4);
	//	}
//		for (int i=0;i<=n-1;i++)
//		{
//			if(i-1>=0&& i+2<=n-1&&i+1<=n-1&&s1.charAt(i-1)==' '&&s1.charAt(i)=='i'&&s1.charAt(i+1)=='s'&&s1.charAt(i+2)==' ')
//			{ 
//				 s3=s3+' ';
//				
//			}
//			else if(i-1>=0&&i+1<=n-1&&s1.charAt(i-1)==' '&&s1.charAt(i)=='s'&&s1.charAt(i+1)==' ')
//			{
//				 s3=s3+' ';
//			}
//			else
//			{ 
//				s3=s3+s2.charAt(i);
//			}
//		}
//		System.out.println(s3);
		// TODO Auto-generated method stub
		

	}

}
