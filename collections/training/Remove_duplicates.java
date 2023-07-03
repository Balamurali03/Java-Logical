package com.collections.training;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates {

	public static void main(String[] args) {
		
		ArrayList <Integer> al=new ArrayList <Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(30);
		al.add(10);
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(al);
		System.out.println(set);
		// TODO Auto-generated method stub

	}

}
