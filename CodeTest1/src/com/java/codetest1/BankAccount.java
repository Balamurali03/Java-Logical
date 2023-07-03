package com.java.codetest1;

import java.util.Scanner;

public class BankAccount 
{
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter details in the order of bankname,holdername,holder number,balance");
		main_account b1=new main_account(sc.next(), sc.next(), sc.nextLong(), sc.nextDouble());
		b1.show_account_details();
		System.out.println("enter amount");
		double amt=sc.nextDouble();
		b1.withdraw(amt);
		System.out.println("enter amount");
		double amt1=sc.nextDouble();
		b1.deposit(amt1);
		b1.check_balance();
		//char a=sc.next().charAt(0);
		// TODO Auto-generated method stub

	}

}
class main_account

{
	
	public String bank_name;
	public String Owner_name;
	public long contact_no;
	
	private double balance;
	

	public main_account(String bank_name, String owner_name, long contact_no, double balance) {
		super();
		this.bank_name = bank_name;
		Owner_name = owner_name;
		this.contact_no = contact_no;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
  public void show_account_details()
  {
	  System.out.println("Account holding bank name is "+ bank_name);
	  System.out.println("Account holder  name is "+ Owner_name);
	  System.out.println("Account holder phone number is "+contact_no);
	  
  }
  public void withdraw(double amt)
  {
	  double bal=balance;
	  if(bal>amt)
	  { 
		  System.out.println(bal-amt);
		  balance=bal-amt;
	  }
	  else
	  {
		  System.out.println("un sufficient balance");
	  }
	  
  }
	
  public void deposit(double amt)
  {
	  double bal=balance;
	  System.out.println(bal+amt);
	  balance=bal+amt;
  }
	
	public void check_balance()
	{
		if(balance>0)
		{
			System.out.println("the balance is : "+balance);
		}
		else
		{
			System.out.println("there is no balance ");
		}
	}
	
	
}









