package code1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListElement {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<String>();
		l1.add("red");
		l1.add("black");
		l1.add("blue");
		l1.add("white");
		l1.add("grey");
		System.out.println(l1);
		
		l1.remove(0);
		l1.add(0, "purple");
		l1.remove(l1.size()-1);
		l1.add( l1.size()-1, "brown");
		
		
	
		Collections.sort(l1);
		System.out.println(l1);
		

	}

}
