package com.pattern.training;

public class Alphabetpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr= {2,3,4,5,6,1};
 int []arr1= {1,6,5,4,3,2};
 int count=0;
 if(arr.length==arr1.length)
 {
 for(int i=0;i<=arr.length-1;i++)
 {
	 for(int j=0;j<=arr1.length-1;j++)
	 {
		 if(arr[i]==arr1[j])
		 {
			 count++;
		 }
	 }
 }
 if(count==arr.length)
 {
	 System.out.println("true");
 }
 else
 {
	 System.out.println("false");
 }
	}
 else
 {
	 System.out.println("it is not a identicalarrays");
 }
	}

}
