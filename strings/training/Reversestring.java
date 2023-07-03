package com.strings.training;

public class Reversestring {
	
 public static void main(String[] args) {
//	String s1="hello";
//	String  s2="";
//	//char ch;
//	for(int i=s1.length()-1;i>=0;i--)
//	{
//		s2= s2+s1.charAt(i);
//		//s2=s2+ch;
//	}
//	System.out.println(s2);
	 
	 String word = "live every moment";
     String reverse = new StringBuffer(word).reverse().toString();
     System.out.println(" original String : " + word +" reversed String :"+ reverse);
  


}	

}
