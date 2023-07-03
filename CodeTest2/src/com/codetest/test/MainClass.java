package com.codetest.test;

import java.util.Scanner;

public class MainClass {
	
	

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id and password details");
	Customer c1=new Customer(sc.nextInt(),sc.next());
	Restaurent r1=new Restaurent();
	SystemOrder so=new SystemOrder();
	System.out.println("enter login details");
	boolean value=c1.Login(sc.nextInt(),sc.next());
	if(value==true)
	{
		System.out.println("the id number "+ c1.id +" is logged in successfully");
		System.out.println("Select Restaurent");
		System.out.println("the list of hotels are");
		boolean value1=c1.SelectRestaurent(sc.next());
		if(value1==true)
		{
			System.out.println("restaurent found");
			System.out.println("Select food");
			c1.menucard();
			System.out.println("no of dishes ");
			int no=sc.nextInt();
			System.out.println("place order");
			boolean value2=false;
			for(int i=1;i<=no;i++)
			{
			value2=c1.PlaceOrder(sc.next(), sc.nextInt());
			}
			
			if(value2==true)
			{
				System.out.println("order placed ");
				System.out.println("here is your recipt");
				c1.recipt();
				System.out.println("payment details");
				c1.Payment(sc.nextInt());
				
				r1.CheckOrder(value);
				r1.DeliverOrder();
			}
			else
			{
				System.out.println("order is not placed");
			}
		}
		else
		{
			System.out.println("no restaurent found");
		}
	}
	else
	{
		System.out.println("the id number "+ c1.id +" is not present");
	}
	
	
	
	
	
	
	
		// TODO Auto-generated method stub

	}

}
