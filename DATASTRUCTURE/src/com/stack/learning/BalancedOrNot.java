package com.stack.learning;

public class BalancedOrNot {

	static boolean b=false;
    //static String str="{[(}])";
	//static String str="{[()]}";
	//static String str="{[)]}";
	//static String str="[[(](]))";
//	static String str="[[[][]]]]";
	static String str="[]]]]";
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
		b=true;
		}
		else
		{
			
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
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(str.charAt(i)=='['||str.charAt(i)=='{'||str.charAt(i)=='(')
			{
				push(str.charAt(i));
				count++;
				//System.out.println( str.charAt(i) );
			}
			else
			{ 
				char c=str.charAt(i);
				switch(c)
				{
				case ')':
					if(!isempty()&&stack[top]=='(')
					{
						pop();
						count++;
					}
					break;
				case ']':
					if(!isempty()&&stack[top]=='[')
					{
						pop();
						count++;
					}
					break;
				case '}':
					if(!isempty()&&stack[top]=='{')
					{
						pop();
						count++;
					}
					break;
				}
			
		}
		}
		
	if(isempty()&&b==false&&count==size)
	{
		System.out.println("balanced");
	}
	else
	{
		System.out.println("not balanced");
	}
		// TODO Auto-generated method stub

	}


}