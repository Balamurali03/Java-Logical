package com.java.learning;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account("dinga",1234567l,"dinga@gmail.com");
		Account a2=new Account("dingi",6789012l,"dingi@gmail.com");
  System.out.println(a1);
  System.out.println(a2);
	}

}
class Account
{
	String username;
	long pwd;
	String email_id;

	Account(String username,long pwd, String email_id)
	{
		this.username=username;
		this.pwd=pwd;
		this.email_id=email_id;
		System.out.println(username +" "+ pwd + " " + email_id);
	}
}
