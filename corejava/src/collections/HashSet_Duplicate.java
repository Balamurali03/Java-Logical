package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Duplicate 
{
	int id;
	String name;
	public HashSet_Duplicate(int id, String name) {
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
	public boolean equals(Object obj) {
//		System.out.println(this.id);
//		System.out.println(i.id);
		return (this.id==obj.hashCode());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet_Duplicate ll1=new HashSet_Duplicate(101,"a");
		HashSet_Duplicate ll2=new HashSet_Duplicate(109,"b");
		HashSet_Duplicate ll3=new HashSet_Duplicate(106,"v");
		HashSet_Duplicate ll4=new HashSet_Duplicate(104,"d");
		HashSet_Duplicate ll5=new HashSet_Duplicate(109,"a");
		HashSet_Duplicate ll6=new HashSet_Duplicate(101,"j");
		
HashSet<HashSet_Duplicate>s=new HashSet<HashSet_Duplicate>();
		
		s.add(ll1);
		s.add(ll2);
		s.add(ll3);
		s.add(ll3);
		s.add(ll4); 
		s.add(ll5);
		s.add(ll6);
	//System.out.println(s);	
		Iterator<HashSet_Duplicate> i1=s.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

}		
}



