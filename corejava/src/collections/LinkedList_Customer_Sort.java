package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedList_Customer_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customersal1 s1=new Customersal1("z",12);
		Customersal1 s2=new Customersal1("r",1);
		Customersal1 s3=new Customersal1("k",3);
		Customersal1 s4=new Customersal1("v",5);
		Customersal1 s5=new Customersal1("l",4);
		Customersal1 s6=new Customersal1("m",7);
		Customersal1 s7=new Customersal1("a",9);
		 
		LinkedList<Customersal1 >l=new LinkedList<Customersal1>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		
		Collections.sort(l,new Benki1());
		System.out.println("after sort by name :"+l);
		Collections.sort(l,new Customersal1());
		System.out.println("after sort by id   :"+l);

	}

}
class Customersal1 implements Comparator<Customersal1>
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
	public Customersal1(String name, double sal) 
	{
		super();
		this.name = name;
		this.sal = sal;
	}
	public Customersal1() 
	{
		
	}		
	@Override
	public String toString() {
		return sal+" : "+name;
	}
	@Override
	public int compare(Customersal1 o1, Customersal1 o2) 
	{
		//return o1.name.compareTo(o2.name);
	//	return o2.sal.compareTo(o1.sal);
		return o1.sal.compareTo(o2.sal);
	}
} 

class Benki1 implements Comparator<Customersal1>
{
   @Override
public int compare(Customersal1 o1, Customersal1 o2)
{
	// TODO Auto-generated method stub
	return o1.name.compareTo(o2.name);
}	   
}

