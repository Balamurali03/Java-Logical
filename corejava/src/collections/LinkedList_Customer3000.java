package collections;

//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;

public class LinkedList_Customer3000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers s1=new Customers("z",12000);
		Customers s2=new Customers("r",10000);
		Customers s3=new Customers("k",3000);
		Customers s4=new Customers("v",5000);
		Customers s5=new Customers("l",4000);
		Customers s6=new Customers("m",7000);
		Customers s7=new Customers("a",2000);
		 
		LinkedList<Customers>l=new LinkedList<Customers>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		
		for(Customers c:l)
		{
			if(c.sal>3000)
			{
				System.out.print(c+" ");
			}
		}
	}
}
class Customers 
{
	String name;
	int sal;
	public Customers(String name, int sal) 
	{
		super();
		this.name = name;
		this.sal = sal;
	}
	public Customers() 
	{
		
	}		
	@Override
	public String toString() {
		return sal+" : "+name;
	}
	   
}

