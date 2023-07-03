package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Customer3000 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer s1=new Customer("z",12000);
		Customer s2=new Customer("r",10000);
		Customer s3=new Customer("k",3000);
		Customer s4=new Customer("v",5000);
		Customer s5=new Customer("l",4000);
		Customer s6=new Customer("m",7000);
		Customer s7=new Customer("a",9000);
		 
		List<Customer>l=new ArrayList<Customer>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		
		for(Customer c:l)
		{
			if(c.sal>3000)
			{
				System.out.print(c+" ");
			}
		}
	}
}

	class Customer 
	{
		String name;
		int sal;
		public Customer(String name, int sal) 
		{
			super();
			this.name = name;
			this.sal = sal;
		}	
		@Override
		public String toString() {
			return sal+" : "+name;
		}
		   
 }

   



