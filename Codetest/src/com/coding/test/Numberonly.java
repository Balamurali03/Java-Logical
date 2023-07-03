package com.coding.test;
public class Numberonly {

	public static void main(String[] args) {
		
		String s="1234";
		try
		{
			int i=Integer.parseInt( s);
			System.out.println(i);
		}
		catch (NumberFormatException e)
		{
			System.out.println("invalid input");
		}
		
		// TODO Auto-generated method stub

	}

}
