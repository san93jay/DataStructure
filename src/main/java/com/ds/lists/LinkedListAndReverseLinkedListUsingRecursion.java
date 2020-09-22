package com.ds.lists;

public class LinkedListAndReverseLinkedListUsingRecursion 
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
		LinkedListAndReverseLinkedListUsingRecursion linkedListAndReverseLinkedListUsingRecursion=new LinkedListAndReverseLinkedListUsingRecursion();
		linkedListAndReverseLinkedListUsingRecursion.insertAtStart(12);
		linkedListAndReverseLinkedListUsingRecursion.insertAtEnd(1);
		linkedListAndReverseLinkedListUsingRecursion.insertAtStart(13);
		linkedListAndReverseLinkedListUsingRecursion.insertAtEnd(5);
		linkedListAndReverseLinkedListUsingRecursion.print();

	}
	private void print() {
	if(head!=null) {
		Node node=head;
		while(node!=null) {
			System.out.println(node.data+" ");
			node=node.next;
		}
	}
		
	}
	private void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	private void insertAtStart(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			node.next=head;
			head=node;
		}
		
	}

}
