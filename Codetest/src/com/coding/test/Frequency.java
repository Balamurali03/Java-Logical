package com.coding.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Frequency {

	public static void main(String[] args) {
		
		
		String s1="bala murali";
		char  arr[]=s1.toCharArray();
		Map<Character,Integer>m1=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(m1.containsKey(arr[i]))
			{
				int x=m1.get(arr[i])+1;
				m1.put(arr[i],x );
			}
			else
			{
				m1.put(arr[i],1 );
			}
		}
		Set<Character> s=m1.keySet();
		for(Character c:s) {
			System.out.println(c+"-"+m1.get(c));
		}
		
		//System.out.println(m1);
		// TODO Auto-generated method stub

	}

	

	

}
