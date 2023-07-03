package com.logical.training;

public class Squaresplitsumequals {
 public static void code(int num)
 {
	 int num2=num*num;
	 int temp=num2;
	 int count=0;
	 int split;
	 int rem=10;
	 while(num2>0)
	 { //int num1=num2;
		 num2=num2/10;
		 count++;
	 }
	 split=count/2;
	// System.out.println(num2);
	 for(int i=1;i<split;i++)
	 {
		 rem=rem*rem;
	 }
	 //System.out.println(rem);
	 if((temp/rem)+(temp%rem)==num)
	 {
		 System.out.println("yes");
	 }
	 else
	 {//System.out.println(num2);
		 System.out.println("no");
	 }
	 
 }
	public static void main(String[] args) {
		code(10);
		// TODO Auto-generated method stub

	}

}
