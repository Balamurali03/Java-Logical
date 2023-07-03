package com.stack.learning;

public class ReverseString {
	static String str="java pro";
	static int size=str.length(),top=-1;
			static char stack[]=new char[size];
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
	public static void push(char ele)
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
				System.out.print(stack[i]);
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
		
		for(int i=0;i<size;i++)
		{
			push(str.charAt(i));
			
		}
		display();
		// TODO Auto-generated method stub

	}

}
