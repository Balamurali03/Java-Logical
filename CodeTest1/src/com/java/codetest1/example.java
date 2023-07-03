package com.java.codetest1;

import java.util.HashMap;
import java.util.Set;





public class example {

	public static void main(String[] args) {
		
		HashMap<Integer,Employee>Database=new HashMap<Integer,Employee>();
		
		//public Map<Integer,Employee> addobject()
		{
			Employee e1=new Employee("bala",11,10000.0,"fullstack");
			Employee e2=new Employee("murali",12,11000.0,"frontend");
			Employee e3=new Employee("rudra",13,12000.0,"backend");
			Employee e4=new Employee("appu",14,13000.0,"datascience");
			Employee e5=new Employee("appu",15,14000.0,"datascience");
			Database.put(e1.geteId(),e1);
			Database.put(e2.geteId(),e2);
			Database.put(e3.geteId(),e3);
			Database.put(e4.geteId(),e4);
			Database.put(e5.geteId(),e5);
			//return Database;
		}
		
		
		  Set<java.util.Map.Entry<Integer, Employee>>empdata=Database.entrySet();
		  
		  
		  for(java.util.Map.Entry<Integer, Employee>data : empdata)
		  {
			  System.out.println(data);
		  }
		// TODO Auto-generated method stub

	}

}
