package com.linkedlist.learning;


 class node
{
	 int data;
	 node address;
	public node(int data)
	{
		this.data=data;
		this.address=null;
	}
}

public class Linked_List {

	 static node root=null;
	public static void insert(int ele)
	{
		node n1=new node(ele);
		if(root==null)
		{
			root=n1;
		}
		else
		{
			node last=root;
			while(last.address!=null)
			{
				last=last.address;
			}
			last.address=n1;
		}
	}
	public static void delete()
	{
		  node last=root,lastbefore=root;
		if(root==null)
		{
			System.out.println("linked list is empty");
		}
		else if(root.address==null)
		{
			root=null;
		}
		else
		{
			while(last.address!=null)
			{
				lastbefore=last;
				last=last.address;
			}
			lastbefore.address=null;
		}
	}
	public static void display()
	{
	 node last=root;
		if(root==null)
		{
			System.out.println("linked list is empty");
		}
		else
		{
			while(last!=null)
			{
				System.out.print(last.data+" ");
				last=last.address;
			}
			System.out.println();
		}
	}
 
	public static void reverse()
	{
		node pointer = root;
		node previous = null, current = null;
	
		
		if(root==null)
		{
			System.out.println("linkedlist is empty");
		}
		else
		{
			 while (pointer != null) 
			 { 
				 current = pointer;
			 pointer = pointer.address; 
			 current.address = previous;
			 previous = current;
			 root = current; 
			 System.out.print(previous.data+" ");
			 }
			 }

						System.out.println();
		}
		
		
	
	
	public static void size()
	{
		 node last=root;
		 int size=0;
		if(root==null)
		{
			System.out.println("linked list is empty");
		}
		else
		{
			while(last!=null)
			{
				size++;
				last=last.address;
			}
			System.out.println(size);
		}
	}

	public static void main(String[] args) {
		
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		display();
		reverse();
		size();
		delete();
		delete();
		delete();
		delete();
		delete();
		display();
		size();
		// TODO Auto-generated method stub

	}

}
