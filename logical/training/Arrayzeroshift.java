package com.logical.training;

public class Arrayzeroshift {

	public static void main(String[] args) {
		int []arr= {1,0,2,0,3,0,4,0,5,0};
		int []res= new int[arr.length];
		int index=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				//continue;
				res[index]=arr[i];
				index++;
			}
//			else
//			{
//				
//			}
		}
		for(int i=0;i<=res.length-1;i++)
		{
			System.out.print(res[i] +" ");
		}
		// TODO Auto-generated method stub

	}

}
