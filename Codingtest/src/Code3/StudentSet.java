package Code3;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class StudentSet {

	public static void main(String[] args) {
		
		Student st1=new Student(101, "bala", 21, "MECH");
		Student st2=new Student(102, "murali", 21, "CSE");
		Student st3=new Student(103, "rudra", 21, "EEE");
		Student st4=new Student(104, "appu", 21, "ECE");
		Student st5=new Student(105, "balamurali", 21, "CIVIL");
		
		Map <Integer,Student>s1=new LinkedHashMap<Integer,Student>();
		s1.put(st1.getId(),st1);
		s1.put(st2.getId(),st2);
		s1.put(st3.getId(),st3);
		s1.put(st4.getId(),st4);
		s1.put(st5.getId(),st5);
		
		 Set<java.util.Map.Entry<Integer, Student>>stdata=s1.entrySet();
		  Student ss=new Student(0, null, 0, null);
		  
		  for(java.util.Map.Entry<Integer, Student>data : stdata)
		  
		{
			  if(data.getKey()==104)
			  {
				  
				  ss.setId(data.getKey());
				  ss.setName(data.getValue().getName());
				  ss.setAge(data.getValue().getAge());
				  ss.setDept(data.getValue().getDept());
			  }
			System.out.println(data.toString());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		  
		  for(java.util.Map.Entry<Integer, Student>data : stdata)
		  
		{
			  if(data.getKey()==103)
			  {
				  Map <Integer,Student>m=new LinkedHashMap<Integer,Student>();
					m.put(data.getKey(), ss);
					 Set<java.util.Map.Entry<Integer, Student>>stdata1=m.entrySet();
					 for(java.util.Map.Entry<Integer, Student>data1 : stdata1)
						  
						{
						 System.out.println(data1.toString());
						}
						}
					 
				  
			  
			  else
			  {
				  System.out.println(data.toString());
			  }
			
		}
		
		
		
	}
  
	
		
		
		// TODO Auto-generated method stub

	}


