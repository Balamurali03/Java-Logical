package com.pattern.training;

public class Practice {

	public static void main(String[] args) {
//		
//		int nums[]= {1, 4, 2, 1, 4, 4, 4};
//			  int count=1;
//			  boolean res=false;
//			  
//			  if(nums.length==0)
//			  {
//			    System.out.println(0); 
//			  }
//			  
//			  for(int i=0;i<=nums.length-1;i++)
//			  {
//			    for(int j=nums.length-1;j>=0;j--)
//			    { int k=j;
//			     if(nums[i]==nums[j])
//			     {
//			      count=count+j+i;
//			      res=true;
//			      break;
//			     }
//			   
//			      
//			    }
//			    
//			      break;
//			    
//			     
//			      
//			  }
//			  System.out.println(count); 
		
//		int nums[]= {1, 3, 1, 4};
//		
//		
//		 for(int i=0;i<=nums.length-1;i++)
//		  {
//		    if(i+1>=nums.length-1&&nums[i]==3&&nums[i+1]!=4)
//		    {
//		      for(int j=i+1;j>=nums.length-1;j++)
//		      {
//		        if(nums[j]==4)
//		        {
//		          nums[j]=nums[i+1];
//		          nums[i+1]=4;
//		        }
//		        System.out.print(nums[j] + " ");
//		        System.out.print(nums[i+1] + " ");
//		        break;
//		      }
//		    }
//		  }
//		 for(int i=0;i<=nums.length-1;i++)
//		 {
//			 System.out.print(nums[i] + " ");
//		 }
//		 
		 
		 int count=0;
		  int count1=0;
		   String str="catdog";
		   
		  if(str.length()<=2)
		  {
		    System.out.println("true"); 
		  }
		  
		  for(int i=0;i<=str.length()-1;i++)
		  {
			  
			  System.out.println();
		   if(i+3<=str.length()-1)
			   
		   {
			   String s1=str.substring(i,i+3);
				  String s2=str.substring(i,i+3);
				  if(s1=="cat")
				  {
					  count++;
					  System.out.println(count);
				  }
				  if(s1=="dog")
				   {
				     count1++;
				   }
		    
		   }
		   
		    
		  }
		  if(count==1&&count1==1)
		  {
		    System.out.println("true"); 
		  }
		  System.out.println("false"); 
		 
		}

		// TODO Auto-generated method stub

	}


