package com.java.execution;
//class Object implements Cloneable 
//{
//	
//}
class overridden
{
	int empid;
	String empname;
	overridden(int empid,String empname )
	{
		this.empid=empid;
		this.empname=empname;
	}
	@Override
	public int hashCode()
	{
		return empid;	
	}
	@Override
	public String toString()
	{
		return empname;
	}
	@Override
	public boolean equals(Object obj)
	{
		return this.empname==obj.toString();
	}
}

public class Orginal implements Cloneable {
	
	@override
	 protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
	
			Object obj=new Object();
			Orginal o1=new Orginal();
			Orginal o2=(Orginal)o1.clone();
			//Object obj1=(Object)obj.clone();
			//Orginal o1=new Orginal();
			
			System.out.println(o1.hashCode());
			System.out.println(obj.hashCode());
			System.out.println(o2.hashCode());
			
			System.out.println("------------------------------------------------");
			
			System.out.println(o1.toString());
			System.out.println(obj.toString());
			System.out.println(o2.toString());
			
			System.out.println("------------------------------------------------");
			
			System.out.println(o1.equals(o2));
			System.out.println(obj.equals(o1));

			System.out.println("------------------------------------------------");
			
			overridden a1=new overridden(123,"rudra");
			overridden a2=new overridden(456,"balamurali");
			
			System.out.println(a1.hashCode());
			System.out.println(a1.toString());
			System.out.println("------------------------------------------------");
			System.out.println(a2.hashCode());
			System.out.println(a2.toString());
			System.out.println("------------------------------------------------");
			System.out.println(a1.equals(a2));
			String s1="hello";
			String s2="hello";
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s1.equals(s2));
		// TODO Auto-generated method stub
		
		

	}

}
