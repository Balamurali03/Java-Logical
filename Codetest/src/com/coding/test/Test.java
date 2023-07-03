package com.coding.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static List<Integer> check(List<Integer> l1)
	{
		List<Integer> list=new ArrayList<Integer>();
		
		int ref1=l1.get(0);
		int ref2=l1.get(0);
		int sum=0;
		int sum1=0;
		for(int i=0;i<=l1.size()-1;i++)
		{
			if(ref1<l1.get(i))
			{
				sum++;
				ref1=l1.get(i);
			}
			if(ref2>l1.get(i))
			{
				sum1++;
				ref2=l1.get(i);
			}
		}
		list.add(sum);
		list.add(sum1);
		return list;
	}

	public static void main(String[] args) {
		
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(24);
		l1.add(3);
		l1.add(5);
		l1.add(3);
		l1.add(25);
		l1.add(29);
		l1.add(8);
		l1.add(10);
		l1.add(15);
		List<Integer> l2=new ArrayList<Integer>();
		l2=check(l1);
		
		int arr[]=new int[2];
		arr[0]=l2.get(0);
		arr[1]=l2.get(1);
		for(int i=0;i<2;i++)
		{
			System.out.print(arr[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
