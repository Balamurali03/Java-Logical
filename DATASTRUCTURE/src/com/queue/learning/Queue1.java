package com.queue.learning;

public class Queue1 {
	static int size=4;
	static int arr[]=new int[size];
	//static int first=0;
	static int last=0;
	
	
	public static boolean isfull()
	{
		if(last==size)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void enQueue(int ele)
	{
		if(isfull())
		{
			System.out.println("the queue is full");
		}
		else
		{
			arr[last]=ele;
			last++;
		}
	}

	public static boolean isempty()
	{
		if(last==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void deQueue()
	{
		if(isempty())
		{
			System.out.println("the queue is empty");
		}
		else
		{
			for(int i=0;i<last-1;i++)
			{
				arr[i]=arr[i+1];
			}
			last--;
		}
	}
	public static void display()
	{
		if(isempty())
		{
			System.out.println("the queue is empty");
		}
		else
		{
			for(int i=0;i<last;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		enQueue(11);
		enQueue(12);
		enQueue(13);
		enQueue(14);
		enQueue(15);
		display();
		deQueue();
		deQueue();
		deQueue();
		deQueue();
		deQueue();
		// TODO Auto-generated method stub

	}

}
                                 