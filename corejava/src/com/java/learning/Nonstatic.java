package com.java.learning;

public class Nonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(new main().a);
    new main().test();
	}

}
class main
{
	int a=10;
	public void test()
	{
		System.out.println("hello dude");
	}
}