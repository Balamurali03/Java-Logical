package com.java.learning;

public class Constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 a1=new Account1("rudra",1234567,"rudy@gmail.com");
		Account1 a2=new Account1("rudy@gmail.com");
		Account1 a3=new Account1(1234567,"rudy@gmail.com");
		
		System.out.println(a1 +" and "+ a2 +" and "+ a3);

	}

}
class Account1
{
	String username;
	long pwd;
	String email_id;

	Account1(String username,long pwd, String email_id)
	{
		this.username=username;
		this.pwd=pwd;
		this.email_id=email_id;
		System.out.println(username +" "+ pwd + " " + email_id);
	}
	Account1( String email_id)
	{
		
		this.email_id=email_id;
		System.out.println( email_id);
	}
	Account1(long pwd, String email_id)
	{
		
		this.pwd=pwd;
		this.email_id=email_id;
		System.out.println( pwd + " " + email_id);
	}
}

