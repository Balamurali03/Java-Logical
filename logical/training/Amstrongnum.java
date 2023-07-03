package com.logical.training;

public class Amstrongnum {
	
      public static void amstrong(int num)
      { 
      int count=0;
      int sum=0;
      int temp=num;
      int num1=num;
    	  while(temp>0)
    	  {
    		  count++;
    		  temp=temp/10;
    	  }
    	  while(num1>0)
    	  {
    		  int rem1=num1%10;
    		  int rem=1;
    		  for(int i=1;i<=count;i++)
    		  {
    		  rem=rem*rem1;
    			   }
    		  sum=sum+rem;
    		  num1=num1/10;
    	  }
    	  
    	  if(num==sum)
    	  {
    		  System.out.println("it is a amstrong number");
    	  }
    	  else
    	  {
    		  System.out.println("it is a not amstrong number");
    	  }
      }
	public static void main(String[] args) {
		amstrong(153);
		// TODO Auto-generated method stub

	}

}
