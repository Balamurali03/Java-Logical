package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Day implements Comparator<Day>
{
	int id;
	String name;
	public Day(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public String toString() {
		return id+" "+name;
	}
	@Override
	public int compare(Day o1,Day o2) {
		return o1.id-o2.id;
	}
}	
public class TreeSet_Duplicate{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day ll1=new Day(101,"a");
		Day ll2=new Day(109,"b");
		Day ll3=new Day(106,"v");
		Day ll4=new Day(104,"d");
		Day ll5=new Day(109,"a");
		Day ll6=new Day(101,"j");
		
		TreeSet<Day>s=new TreeSet<Day>(new Day(0,null));
		
		s.add(ll1);
		s.add(ll2);
		s.add(ll3);
		s.add(ll3);
		s.add(ll4); 
		s.add(ll5);
		s.add(ll6);
	System.out.println(s);	
		Iterator<Day> i1=s.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

}	
}




