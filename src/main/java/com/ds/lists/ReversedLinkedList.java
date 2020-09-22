package com.ds.lists;

public class ReversedLinkedList {
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
		ReversedLinkedList reversedLinkedList=new ReversedLinkedList();
		reversedLinkedList.insertAtStart(12);
		reversedLinkedList.insertAtEnd(1);
		reversedLinkedList.insertAtEnd(2);
		reversedLinkedList.insertAtAPoint(2,4);
		
		reversedLinkedList.show();
		System.out.println("revers List");
		reversedLinkedList.reverseLinkedList();
		reversedLinkedList.show();

	}
	private void reverseLinkedList() {
		Node current,prev,nextNode;
		current=head;
		prev=null;
		while(current!=null) {
			nextNode=current.next;
			current.next=prev;
			prev=current;
			current=nextNode;
		}
		head=prev;
		
	}
	private void show() {
		
		if(head!=null) {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	private void insertAtAPoint(int postion, int data) {
		Node newNode=new Node(data);
		if(postion==0){
			insertAtStart(data);
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
	private void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head!=null) {
			Node temp=head;
			while(temp.next!=null) {
            temp=temp.next;				
			}
			temp.next=newNode;
			
		}else {
			insertAtStart(data);
		}
	}
	private void insertAtStart(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			head.next=node;
			node=head;
		}
	}

}
