package com.ds.lists;

public class LinkedListLastInsert {
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
		LinkedListLastInsert linkedListLastInsert=new LinkedListLastInsert();
		linkedListLastInsert.insertAtEnd(2);
		linkedListLastInsert.insertAtEnd(4);
		linkedListLastInsert.insertAtEnd(1);
		linkedListLastInsert.insertAtEnd(7);
		linkedListLastInsert.showList();

	}

	private void showList() {
		if(head!=null) {
			Node node=head;
			
			while(node!=null) {
				System.out.println(node.data+" ");
				node=node.next;
			}
		}
		
	}

	private void insertAtEnd(int i) {
		Node newNode=new Node(i);
		if(head== null) {
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}

}
