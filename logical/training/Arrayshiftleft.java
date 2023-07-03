package com.logical.training;

public class Arrayshiftleft {

		public static void main(String[] args) {
			int []arr= {1,0,2,0,3,0,4,0,5,0,6};
			int []res= new int[arr.length];
			int index=arr.length-1;
			for(int i=arr.length-1;i>=0;i--)
			{
				if(arr[i]!=0)
				{
					res[index]=arr[i];
					index--;
				}			
			}
			for(int i=0;i<=res.length-1;i++)
			{
				System.out.print(res[i] +" ");
			}
		// TODO Auto-generated method stub

	}

}
