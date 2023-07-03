package com.strings.training;

public class Removeduplicatesinarray {

//	public static int removeDuplicateElements(int arr[], int n)
//	{  
//        int[] temp = new int[n];  
//        int j = 0;  
//        for (int i=0; i<n-1; i++)
//        {  
//            if (arr[i] != arr[i+1])
//            {  
//                temp[j++] = arr[i];  
//            }  
//         }  
//        temp[j++] = arr[n-1];     
//        for (int i=0; i<j; i++)
//        {  
//            arr[i] = temp[i];  
//        }  
//        return j;  
//    }  
//       
//    public static void main (String[] args)
//    {  
//        int arr[] = {10,20,20,30,30,40,50,50};  
//        int length = arr.length;  
//        length = removeDuplicateElements(arr, length);  
//        for (int i=0; i<length; i++) 
//        {
//           System.out.print(arr[i]+" ");  
//        }
 //   }  

public static void main (String[] args)
{  
	int arr[] = {10,20,20,30,30,40,50,50};
	int count=0;
	int[] arr2 = new int[count];
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr2.length-1;j++)
		{
			if(arr[i]==arr[j])
			{
				arr[j]=0;
				count++;
			}
		}
	}
	int[] arr1 = new int[arr.length-count];  
	
	for(int i=0;i<=arr1.length-1;i++)
	{
		if(arr[i]!=0)
		{
			arr1[i]=arr[i];
		}
	}
	
}
}  

