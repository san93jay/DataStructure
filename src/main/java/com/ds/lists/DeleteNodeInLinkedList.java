package com.ds.lists;

public class DeleteNodeInLinkedList {
	
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
		DeleteNodeInLinkedList deleteNodeInLinkedList=new DeleteNodeInLinkedList();
		deleteNodeInLinkedList.insertAtStarting(2);
		deleteNodeInLinkedList.insertAtStarting(24);
		deleteNodeInLinkedList.insertAtStarting(3);
		deleteNodeInLinkedList.deleteAtIndex(1);
		deleteNodeInLinkedList.show();
	}
	private void show() {
		if(head!=null) {
			Node temp=head;
			while(temp!=null){
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	private void deleteAtIndex(int index) {
		Node node=head;
		Node prev=head;
		if(index==0) {
			head=head.next;
		}else {
			for(int i=0;i<index-1;i++) {
				node=node.next;
			}
			prev=node.next;
			node.next=prev.next;
			prev=null;
		}
	}
	private void insertAtStarting(int data) 
	{
		Node newNode=new Node(data);
		if(head==null) {
		  head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
}
