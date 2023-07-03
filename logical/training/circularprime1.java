package com.logical.training;

public class circularprime1 {

	public static void cirprime(int num) {
		int num1 = num;
		int count = 0;
		int res=0;
		while (num1 > 0) {
			 res = num1 % 10;
			
		     if (num1 % 2 == 0) {
				count++;
			}
			num1 = num1 / 10;
		}
		if (count == 0&&res!=1) {
			System.out.println("TRUE" + num + " it is special prime");
			
		} 
		else {
			System.out.println("FALSE" +  num + " it is not a special prime");
		}
	}

	public static void main(String[] args) {
		cirprime(31);
		cirprime(113);
	}

}
