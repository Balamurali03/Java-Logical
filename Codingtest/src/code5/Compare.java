package code5;


public class Compare {

	public static void main(String[] args) {
		
		
		
		Student st1=new Student(101, "bala", 21, "MECH");
		Student st2=new Student(103, "murali", 21, "CSE");
		
		
	
		
		if(st1.compareTo(st2)<0)
		{
			System.out.println(st1);
			System.out.println(st2);
		}
		else
		{
			System.out.println(st2);
			System.out.println(st1);
		}
		
		// TODO Auto-generated method stub
	}

}
