package com.strings.training;

public class Removeduplicatesfromstring {

	public static void main(String[] args) {
		
		//remove repeated elements in a string 
//		String s1 = new String("abbc");
//        String s2 = new String("");
//
//        for (int i = 0; i < s1.length(); i++){
//            if (i + 1 < s1.length() && s1.charAt(i) != s1.charAt(i+1)){
//                s2 = s2 + s1.charAt(i);
//            }
//            if (i + 1 == s1.length()){
//                s2 = s2 + s1.charAt(i);
//            }
//        }
//        System.out.println(s2);
		
		
            //remove duplicates from a string
		
		String s1 = new String("abacbc");
        String s2 = new String("");
	      for (int i=0 ;i<s1.length();i++)
	      {
	          char ch = s1.charAt(i);
	          if (!s2.contains(""+ch)) 
	          {
	             s2= s2+""+ch;
	          }
	      }
		
	      System.out.println(s2);
    }


	}


