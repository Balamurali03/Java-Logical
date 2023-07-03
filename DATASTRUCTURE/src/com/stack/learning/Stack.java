package com.stack.learning;

public class Stack {
	static int size=5,top=-1,stack[]=new int[size];
	public static boolean isfull()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void push(int ele)
	{
		if(isfull())
		{
			System.out.println("stack is full");
		}
		else
		{
			top++;
			stack[top]=ele;
		}
	}
	public static boolean isempty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void pop( )
	{
		if(isempty())
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println(stack[top]+" is deleted");
			top--;
			
		}
	}
	public static void display( )
	{
		if(isempty())
		{
			System.out.println("stack is empty");
		}
		else
		{ 
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
			
			
		}
	}
	public static void peek( )
	{
		if(isempty())
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println(stack[top]);
			
		}
	}
	public static void main(String[] args) {
		push(11);
		push(12);
		push(13);
		push(14);
		push(15);
		push(11);
		display();
		peek();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
	}
}
