package com.interview.coding;

public class Maxminarray {

	public static void main(String[] args) {
		
		
		int arr1[]= {1,2,3,4,5,6,7,8};
		int num1=0;
		int num=0;
		int count=0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(i%2==0)
			{
				int temp=arr1[i];
				arr1[i]=arr1[(arr1.length-1)-num1];
				
				arr1[(arr1.length-1)-num1]=temp;
				num1++;
			}
			else
			{
				int temp=arr1[i];
				arr1[i]=arr1[num];
				
				arr1[num]=temp;
				count++;
			}	
			if(count==2)
			{
				num++;
				count=0;
			}
			
		}
		
		
//		int j=0;
//		int k=0;
//		for(int i=0;i<=arr1.length-1;i++)
//		{ 
//			if(i%2==0)
//			{
//				int temp= arr1[i];
//				int temp1=arr1[(arr1.length-1)-i];
//				int temp2=arr1[i+1];
//				arr1[i]=temp1;
//				arr1[i+1]=temp;
//				arr1[(arr1.length-1)-i]=temp2;
//				
//				for(int z=0;z<=arr1.length-1;z++)
//				{
//					System.out.print(arr1[z] +" ");
//				}
//				System.out.println();
//			}
////			else
////			{
////			
////			
////			int temp= arr1[i];
////			arr1[i]=arr1[(arr1.length-1)-k];
////			arr1[(arr1.length-1)-k]=temp;
////			k++;
////         		for(int x=0;x<=arr1.length-1;x++)
////				{
////					System.out.print(arr1[x] +" ");
////				}
////				System.out.println();
////			}
////		
//		}
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i] +" ");
		}
		
		// TODO Auto-generated method stub

	}

}
