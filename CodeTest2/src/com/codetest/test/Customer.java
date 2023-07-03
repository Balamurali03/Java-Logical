package com.codetest.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer {
	public static int id;
	protected static String pwd;
	
	public static String hotel;
	public static String food;
	public static int cost=0;
	public static int cost1=0;
	
	
	
	public Customer(int id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
public boolean Login(int id,String pwd)
{
	if(pwd.equals(getPwd()))
	{
		
		return true;
	}
	else
	{
		
		return false;
	}
}
public boolean SelectRestaurent(String hotel)
{
	SystemOrder so=new SystemOrder();
	if(so.RestaurentList(hotel))
	{
		return true;
	}
	else
	{
		return false;
	}

}
public void menucard()
{
	SystemOrder so=new SystemOrder();
	
	so.MenuCard();
}
public boolean PlaceOrder(String food,int num)
{
	
	
	Customer.food=food;
	HashMap <String,Integer>h1=new HashMap<String,Integer>();
	h1.put("idly",15);
	h1.put("dosa",20);
	h1.put("puri",20);
	h1.put("pulavu",40);
	h1.put("biriyani",100);
	h1.put("parotta",20);
	h1.put("chicken65",70);
	h1.put("chapathi",20);
	h1.put("sambarrice",35);
	h1.put("rice",35);
	h1.put("pongal",40);
	h1.put("kabab",20);
	h1.put("tomatorice",30);
	
	if(h1.containsKey(food))
	{
		cost=cost+h1.get(food)*num;
		
		return true;
	}
	else
	{
		
		return false;
	}
	
	
}


public void recipt()
{
	System.out.println("the amount should be paid is "+ cost);
}
public void Payment(int amt)
{
	if(amt==cost)
	{
		System.out.println("payment done sucessful");
	}
	if(amt>cost)
	{
		System.out.println("payment done sucessful");
		System.out.println("and your  balance is "+ (amt-cost));
	}
	if(amt<cost)
	{
		cost1=amt-cost;
		System.out.println("payment is not done sucessful");
		System.out.println("you should pay extra amount  of "+ (cost-amt));
	}
}
}


class Restaurent 
{
	
	public void CheckOrder(boolean value)
	{
		if(Customer.food!=null&&value==true)
		{
			System.out.println("order is checked");
		}
		else
		{
			System.out.println("order not done");
		}
		
	}
	public void DeliverOrder()
	{
		if(Customer.cost!=0&&Customer.cost1==0)
		{
			System.out.println("order is deliverd");
		}
		else
		{
			System.out.println("order is not delivered");
		}
	}
}






















