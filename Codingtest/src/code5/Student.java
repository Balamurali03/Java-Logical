package code5;

import java.util.Objects;

public class Student implements Comparable<Student>

{

	private int id;
	private String name;
	private int age;
	private String dept;
	public Student()
	{
		System.out.println();
	}
	public Student(int id, String name, int age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	@Override
	public int compareTo(Student o) {
		int id=this.id;
		int id1=o.id;
		
		return id-id1;
	}
	

}
