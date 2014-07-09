package com.java.oracle.test;

public class LinkedList {
	class Node {
	    Node next;
	    Object num;
	    public Node(Object val) {
	        num = val;
	        next = null;
	    }
	}

	    private Node head = null;
	    private Node getLastNode() {
	        if (head == null) {
	            return null;
	        }
	        Node tmpNode = head;
	        while (tmpNode.next != null) {
	            tmpNode = tmpNode.next;
	        }
	        return tmpNode;
	    }
	    public void append(int val) {
	        Node lastNode = getLastNode();
	        if (lastNode == null) {
	            head = new Node(val);
	        } else {
	            lastNode.next = new Node(val);
	        }
	    }

	    public void delete(Object val) {
	        if(head == null){
	            return;
	        }

	        Node prevNode = null;
	        Node currNode = head;
	        while (currNode != null && !currNode.num.equals(val)) {
	            prevNode = currNode;
	            currNode = currNode.next;
	        }
	        if(prevNode == null){
	            head = head.next;
	            return;
	        }
	        if (currNode == null) {
	            System.out.println("A node with that value does not exist.");
	            return;
	        }
	        prevNode.next = currNode.next;
	    }
	    public int size()
	    {
	    	int size=1;
	    	for(Node n = head; n.next != null; n = n.next)
	    	       size++; 
	    	
	    	return size;
	    }

	    public void print() {
	        if(head == null){
	            System.out.println("List is EMPTY");
	            return;
	        }
	        Node tmpNode = head;
	        while (tmpNode != null) {
	            System.out.print(tmpNode.num + " -> ");
	            tmpNode = tmpNode.next;
	        }
	    }
	    
	    public void reverseList(){
	        if(head == null || head.next == null){
	               return;
	        }
	        
	        Node firstNode = head;
	        Node midNode;
	        Node lastNode;
	        
	      
	        midNode = firstNode.next;
	        lastNode  = midNode.next;
	        
	        firstNode.next = null;
	        while(lastNode!=null){
	               midNode.next = firstNode;
	               
	               firstNode = midNode;
	               midNode = lastNode;
	               lastNode = lastNode.next;
	        }
	        
	        midNode.next = firstNode;
	        head = midNode;
	        
	     }

	    

	    public static void main(String[] args) {
	        LinkedList myList = new LinkedList();
	        myList.print();
	        System.out.println("Adding Elements");
	        myList.append(35);
	        myList.append(33);
	        myList.append(43);
	        myList.append(53);
	        System.out.println("size of list after inserting elements:-  "+myList.size());
	        myList.print();
	        myList.reverseList();
	         System.out.println("check reverse : ");
	         myList.print();
	        System.out.println("Deleting Elements 33 & 35");
	        myList.delete(33);
	        myList.delete(35);
	        System.out.println("Elements in the list after deleting ");
	        myList.print();
	        System.out.println("size of the list after deleting elements  :- "+myList.size());
	    }
	
}
