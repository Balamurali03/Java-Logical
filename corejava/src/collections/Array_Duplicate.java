package collections;

import java.util.ArrayList;
import java.util.List;

public class Array_Duplicate{
	int id;
	String name;

	public Array_Duplicate(int id, String name) {
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
		return "Array_Duplicate [id=" + id + ", name=" + name + "]";
	}

	public boolean equals(Array_Duplicate i) {
		System.out.println(this.id);
		System.out.println(i.id);
		return this.name==i.name;
	}


	public static void main(String[] args) {
		Array_Duplicate a1=new Array_Duplicate(101,"aa");
		Array_Duplicate a2=new Array_Duplicate(101,"aa");
		Array_Duplicate a3=new Array_Duplicate(101,"hj ");
		Array_Duplicate a4=new Array_Duplicate(101,"aa");
		Array_Duplicate a5=new Array_Duplicate(101,"bb");
		
		List <Array_Duplicate>l=new ArrayList<Array_Duplicate>();
		
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a3);
		l.add(a4);
		l.add(a5);
		
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
