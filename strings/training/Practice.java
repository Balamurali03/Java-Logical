package com.strings.training;

public class Practice {

	public static void main(String[] args) {
		char ch='d';
		String str="balamuralirurra";
		char [] arr= str.toCharArray();
		//System.out.print(arr);
		
		System.out.println(arr[12]);
		arr[12]=ch;
		System.out.println(arr[12]);
		System.out.println(arr);
		
		str=arr.toString();
		System.out.println(str);
		// TODO Auto-generated method stub

	}

}
