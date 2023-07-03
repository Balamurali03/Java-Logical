package com.java.codetest1;

public class Employee {

	private String name;
	private int eId;
	private double salary;
	private String desigination;
	
	public Employee()
	{
		System.out.println("model class created successful");
	}
	
	public Employee(String name, int eId, double salary, String desigination) {
		super();
		this.name = name;
		this.eId = eId;
		this.salary = salary;
		this.desigination = desigination;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}

}
// class Str
