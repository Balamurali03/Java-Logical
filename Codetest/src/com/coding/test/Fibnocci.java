package com.coding.test;

public class Fibnocci {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int k;
		System.out.print(a +" ");
		System.out.print(b +" ");
		for(int i=3;i<=n;i++)
		{ k=a+b;
		System.out.print(k +" ");
		a=b;
		b=k;
			
		}
		// TODO Auto-generated method stub

	}

}
