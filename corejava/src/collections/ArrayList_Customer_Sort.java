package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Customer_Sort { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Customersal s1=new Customersal("z",12);
		Customersal s2=new Customersal("r",1);
		Customersal s3=new Customersal("k",3);
		Customersal s4=new Customersal("v",5);
		Customersal s5=new Customersal("l",4);
		Customersal s6=new Customersal("m",7);
		Customersal s7=new Customersal("a",9);
		 
		List<Customersal >l=new ArrayList<Customersal>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
	//	Customersal cs= new Customersal(null,0);
		//System.out.println("before sort :"+l);
	//
		Collections.sort(l,new Benki());
		System.out.println("after sort by name :"+l);
		Collections.sort(l,new Customersal());
		System.out.println("after sort by id   :"+l);
	}
}

class Customersal implements Comparator<Customersal>
	{
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
		String name;
		Double sal;
		public Customersal(String name, double sal) 
		{
			super();
			this.name = name;
			this.sal = sal;
		}
		public Customersal() 
		{
			
		}		
		@Override
		public String toString() {
			return sal+" : "+name;
		}
		@Override
		public int compare(Customersal o1, Customersal o2) 
		{
			//return o1.name.compareTo(o2.name);
		//	return o2.sal.compareTo(o1.sal);
			return o1.sal.compareTo(o2.sal);
		}
	} 
   class Benki implements Comparator<Customersal>
   {
	   @Override
	public int compare(Customersal o1, Customersal o2)
	{
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}	   
 }





















 
	

