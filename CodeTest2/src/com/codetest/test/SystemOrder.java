package com.codetest.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SystemOrder {
	
	public static String hotel;
	
	private Object c2;

	public void Login(int id,String password)
	{
		Customer c2=new Customer(Customer.getId(), Customer.getPwd());
		if(password.equals(c2.getPwd())&&id==c2.getId())
		{
			System.out.println("login sucessfull");
		}
		else
		{
			System.out.println("no id found");
		}
	}
	public boolean RestaurentList(String hotel)
	{
		Customer c2=new Customer(Customer.getId(), Customer.getPwd());
		List <String>l1=new ArrayList<String>();
		l1.add("house of kebabs");
		l1.add("prasanth");
		l1.add("samsurki");
		l1.add("olivegrove");
		l1.add("shiro");
		l1.add("lotuspavillion");
		int count=0;
		
		for(int i=0;i<l1.size();i++)
		{
			if(hotel.equals(l1.get(i)))
			{
				count++;
				this.hotel=hotel;
			}
		}
		if(count==1)
		{
			return true;
			
		}
		else
		{
			return false;
			
		}
	}
	
	public void MenuCard() 
	{
		FoodItems fi1=new FoodItems("idly",15);
		FoodItems fi2=new FoodItems("dosa",25);
		FoodItems fi3=new FoodItems("puri",25);
		FoodItems fi4=new FoodItems("pulavu",40);
		FoodItems fi5=new FoodItems("biriyani",100);
		FoodItems fi6=new FoodItems("tomatorice",35);
		FoodItems fi7=new FoodItems("rice",35);
		FoodItems fi8=new FoodItems("sambarrice",35);
		FoodItems fi10=new FoodItems("pongal",40);
		FoodItems fi11=new FoodItems("chapathi",20);
		FoodItems fi12=new FoodItems("kabab",60);
		FoodItems fi13=new FoodItems("chicken65",90);
		FoodItems fi14=new FoodItems("parotta",25);
		
		Food f1=new Food(fi1.toString(), fi2.toString(), fi3.toString(), fi4.toString(), fi5.toString());
		Food f2=new Food(fi1.toString(), fi14.toString(), fi13.toString(), fi11.toString(), fi12.toString());
		Food f3=new Food(fi1.toString(), fi2.toString(), fi10.toString(), fi6.toString(), fi5.toString());
		Food f4=new Food(fi1.toString(),fi2.toString(), fi8.toString(),fi4.toString(), fi5.toString());
		Food f5=new Food(fi1.toString(), fi2.toString(), fi3.toString(), fi7.toString(), fi5.toString());
		Food f6=new Food(fi1.toString(), fi2.toString(), fi3.toString(), fi6.toString(), fi5.toString());
		
		HashMap <String,Food>h1=new HashMap<String,Food>();
		h1.put("house of kebabs",f1);
		h1.put("prasanth",f2);
		h1.put("samsurki",f3);
		h1.put("olivegrove",f4);
		h1.put("shiro",f5);
		h1.put("lotuspavillion",f6);
		if(h1.containsKey(hotel))
		{
		System.out.println(h1.get(hotel).toString());	
		}
		else
		{
			System.out.println("no restaurent found");
		}
	}

}
