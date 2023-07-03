package collections;

import java.util.HashSet;

class After
{
	
	double sal;
	String name;
	public After(double sal, String name) {
		super();
		this.sal = sal;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sal+" "+name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}

public class HashSet_Customer3000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		After a1=new After (7023,"mtk");
		After a2=new After (10223,"mtk");
		After a3=new After (21523,"mtk");
		After a4=new After (2023,"mtk");
		
		HashSet<After> V=new HashSet<After>();
		V.add(a1);
		V.add(a2);
		V.add(a3);
		V.add(a4);
		for(After e: V)
		{
			if(e.sal>3000)
			{
				System.out.println(e);
			}
		}
	}

}
