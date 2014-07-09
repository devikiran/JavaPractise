package com.java.oracle.test;


public class NewLinkedList {
class Node{
	Node next;
	int num;
	public Node(int val) {
	this.num=val;
	}
}
public Node head=null;

public Node getLastNode()
{
	if(head==null)
	{
		return null;
	}
	Node tempNode=head;
	while(tempNode.next!=null)
	{
		tempNode=tempNode.next;
	}
	return tempNode;
		
}

public void add(int val)
{
	Node lastNode=getLastNode();
	if(lastNode==null)
	{
		lastNode=new Node(val);
	}
	else 
	{
		lastNode.next=new Node(val);
	}
}

public void print()
{
	if(head==null)
	{
		System.out.println("EMPTY");
	}
	 Node tmpNode = head;
     while (tmpNode != null) {
         System.out.print(tmpNode.num + " -> ");
         tmpNode = tmpNode.next;
     }
}
}
