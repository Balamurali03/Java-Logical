package com.pattern.training;

public class Pattern1 {
 public static void test(int N)
 { int n=N;
 int k=N;
 while(k>0)
 {
	 for(int i=n;i>=1;i--) 
	 {
		 for(int j=k;j>=1;j--)
		 {
			 System.out.print(i);
		 }	
	 }
	 System.out.println();
	 k--;
 }
 }
	public static void main(String[] args) {
		test(4);
		// TODO Auto-generated method stub

	}

}
