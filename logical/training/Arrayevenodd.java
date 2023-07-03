package com.logical.training;

public class Arrayevenodd {

	public static void main(String[] args) {
			int []arr= {1,2,3,4,5,6,7,8,9,10,11,12,14,16};
			int []res= new int[arr.length];
			int index=arr.length-1;
			int index1=0;
			int num=0;
			for(int i=arr.length-1;i>=0;i--)
			{
				if(arr[i]%2!=0)
				{
					res[index]=arr[i];
					index--;
				}	
				if(arr[num]%2==0)
				{
					res[index1]=arr[num];
					index1++;
				}
				num++;
			}
			for(int i=0;i<=res.length-1;i++)
			{
				System.out.print(res[i] +" ");
			}

		// TODO Auto-generated method stub

	}

}
