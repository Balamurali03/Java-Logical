package com.java.codetest1;

import java.util.HashMap;
import java.util.Scanner;

public class MapCode {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=sc.nextInt();
		
		HashMap <String,String>h1=new HashMap<String,String>();
		h1.put("bread","butter");
		h1.put("icecream","butter");
		h1.put("pancake","butter");
		for(int i=1;i<=n;i++)
		{
			h1.put(sc.next(),sc.next() );
		}
		if(n==0)
		{
			for(String s:h1.keySet())
			{
				System.out.println(s+" "+h1.get(s) );
				
			}
		
		}
		else
		{
			if(h1.get(h1)=="icecream")
			{
				
			}
			else
			{
				for(String s:h1.keySet())
				{
					System.out.println(s+" "+h1.get(s) );
					
				}
			}
			
			
			
		}
		// TODO Auto-generated method stub

	}

}
