package Code2;

import java.util.ArrayList;

public class ListArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l1=new ArrayList<Integer>();
		
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
		l1.set(2, l1.get(5)+l1.get(2));
		l1.set(5, l1.get(2)-l1.get(5));
		l1.set(2, l1.get(2)-l1.get(5));
		
		System.out.println(l1);
		
		
	}

}
