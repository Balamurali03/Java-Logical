package collections;

import java.util.Comparator;
import java.util.TreeSet;

class After1 implements Comparator<After1>
{
	
	double sal;
	String name;
	public After1(double sal, String name) {
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
	@Override
	public int compare(After1 o1, After1 o2) {
		// TODO Auto-generated method stub
		return (int) o1.sal;
	}
	
}

public class TreeSet_Customer3000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		After1 a1=new After1 (7023,"mtk");
		After1 a2=new After1 (10223,"mtk");
		After1 a3=new After1 (21523,"mtk");
		After1 a4=new After1 (2023,"mtk");
		
		TreeSet<After1> V= new TreeSet(new After1(0, null));
		V.add(a1);
		V.add(a2);
		V.add(a3);
		V.add(a4);
		for(After1 e: V)
		{
			if(e.sal>3000)
			{
				System.out.println(e);
			}
		}
	}
}


