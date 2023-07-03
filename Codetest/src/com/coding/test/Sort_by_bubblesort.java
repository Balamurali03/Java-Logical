package com.coding.test;

public class Sort_by_bubblesort {

	public static void main(String[] args) {
				
				int arr[]= {2,1,4,3,8,0,6,5};
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<arr.length-1;j++)
					{
						if(arr[j]>arr[j+1])
						{ int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
				}
				for(int i=0;i<=arr.length-1;i++)
				{
					System.out.print(arr[i] +" ");
				}
				// TODO Auto-generated method stub

			

		

		// TODO Auto-generated method stub

	}

}
