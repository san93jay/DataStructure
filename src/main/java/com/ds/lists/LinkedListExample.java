package com.ds.lists;

public class LinkedListExample 
{
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	public static void main(String[] args) {
		
		LinkedListExample linkedListExample=new LinkedListExample();
		linkedListExample.insertFirst(2);
		linkedListExample.insertFirst(4);
		linkedListExample.insertFirst(1);
		linkedListExample.printNodes();
	}

	private void printNodes() {
			Node newTemp=head;
			while(newTemp!=null) {
				System.out.println(newTemp.data+"");
				newTemp=newTemp.next;
			
		}
		
	}

	private void insertFirst(int i) {
		if(head==null) {
			head=new Node(i);
		}else {
			Node newNode=new Node(i);
			newNode.next=null;
			newNode.next=head;
			head=newNode;
		}
		
	}

}
