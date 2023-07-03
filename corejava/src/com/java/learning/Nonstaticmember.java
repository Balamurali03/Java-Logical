package com.java.learning;

public class Nonstaticmember {
	int a=10;
	 public void test()
	 {
		 System.out.println("hello buddy");
		 System.out.println(a);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(new Nonstaticmember().a);
   new Nonstaticmember().test();
	}

}
