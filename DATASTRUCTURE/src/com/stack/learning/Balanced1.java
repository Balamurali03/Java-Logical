package com.stack.learning;

public class Balanced1 {
	static boolean b=false;
	//static String str="{[(}])";
	//static String str="{[()]}";
      //static String str="{[()]}";
	//static String str="[[(](]))";
	//static String str="[{)}]";
	static String str="[[]]]]";
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
		
		for(int i=0;i<size;i++)
		{
			if(str.charAt(i)=='['||str.charAt(i)=='{'||str.charAt(i)=='(')
		{
			push(str.charAt(i));
			
			//System.out.println( str.charAt(i) );
		}
			else if(str.charAt(i)==')')
			{
				if(!isempty()&&stack[top]=='(')
				{
					pop();
				}
				else
				{
					System.out.println("not balanced");
					return;
				}
				
			
			}
			else if(str.charAt(i)==']')
			{
				if(!isempty()&&stack[top]=='[')
				{
					pop();
				}
				else
				{
					System.out.println("not balanced");
					return;
				}
				
			}
			else if(str.charAt(i)=='}')
			{
				if(!isempty()&&stack[top]=='{')
				{
					pop();
				}
				else
				{
					System.out.println("not balanced");
					return;
				}
				
			}
		// TODO Auto-generated method stub

	}
		if(isempty()&&b==false)
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("not balanced");
		}

}
}
