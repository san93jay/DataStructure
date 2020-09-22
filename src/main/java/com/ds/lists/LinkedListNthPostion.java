package com.ds.lists;

public class LinkedListNthPostion {
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
		LinkedListNthPostion linkedListNthPostion=new LinkedListNthPostion();
//		linkedListNthPostion.insertStarting(2);
//		linkedListNthPostion.insertStarting(6);
//    	linkedListNthPostion.insertStarting(9);
//		linkedListNthPostion.insertStarting(8);
		//linkedListNthPostion.insertAtEnd(0);
		linkedListNthPostion.insertInNthPostion(7,0);
		linkedListNthPostion.insertInNthPostion(3,1);
		linkedListNthPostion.insertInNthPostion(4,2);
		linkedListNthPostion.insertInNthPostion(5,3);
		linkedListNthPostion.printNodes();

	}

	private void printNodes() {
		if(head!=null) {
			Node node=head;
			while(node!=null) {
				System.out.println(node.data+" ");
				node=node.next;
			}
		}
		
	}

	private void insertStarting(int i) {
		if(head==null) {
			head=new Node(i);
		}else {
			Node newNode=new Node(i);
			newNode.next=head;
			head=newNode;
			
		}
		
	}
	private void insertAtEnd(int data) {
		Node newNode=new Node(data);
		Node temp=head;
		while(head.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}

	private void insertInNthPostion(int data,int postion) {
		Node newNode=new Node(data);
	 if(postion==0){
			insertStarting(data);
		}else if(postion==1){
			insertAtEnd(data);
		}else {
			Node temp=head;
			for(int i=0;i<postion-1;i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
			
		}
		
		
	}

}
