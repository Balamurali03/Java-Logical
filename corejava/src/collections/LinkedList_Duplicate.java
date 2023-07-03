package collections;

import java.util.LinkedList;

public class LinkedList_Duplicate{
	int id;
	String name;

	public LinkedList_Duplicate(int id, String name) {
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
		return "LinkedList_Duplicate [id=" + id + ", name=" + name + "]";
	}

	public boolean equals(LinkedList_Duplicate i) {
		//System.out.println(this.id);
		//System.out.println(i.id);
		return this.name==i.name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Duplicate ll1=new LinkedList_Duplicate(101,"a");
		LinkedList_Duplicate ll2=new LinkedList_Duplicate(109,"b");
		LinkedList_Duplicate ll3=new LinkedList_Duplicate(106,"v");
		LinkedList_Duplicate ll4=new LinkedList_Duplicate(104,"d");
		LinkedList_Duplicate ll5=new LinkedList_Duplicate(109,"e");
		//LinkedList_Duplicate ll6=new LinkedList_Duplicate(101,"j");
		
LinkedList <LinkedList_Duplicate>l=new LinkedList<LinkedList_Duplicate>();
		
		l.add(ll1);
		l.add(ll2);
		l.add(ll3);
		l.add(ll3);
		l.add(ll4);
		l.add(ll5);
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();)
			{
				if(l.get(i).equals(l.get(j)))
				{
					l.remove(j);
				}
				else
				{
					j++;
				}
			}
			
		}
		System.out.println(l);
	}
}

	


