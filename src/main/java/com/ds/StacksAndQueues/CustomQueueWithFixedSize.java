package com.ds.StacksAndQueues;

public class CustomQueueWithFixedSize {
	int queue[]=new int[5];
	int front,rear,size;

	public static void main(String[] args) {
		
		CustomQueueWithFixedSize customQueueWithFixedSize=new CustomQueueWithFixedSize();
		customQueueWithFixedSize.enqueue(5);
		customQueueWithFixedSize.enqueue(2);
		customQueueWithFixedSize.enqueue(6);
		customQueueWithFixedSize.enqueue(9);
		
		customQueueWithFixedSize.deQueue();
		customQueueWithFixedSize.deQueue();
		customQueueWithFixedSize.enqueue(1);
		customQueueWithFixedSize.enqueue(19);
		
		customQueueWithFixedSize.enqueue(11);
		customQueueWithFixedSize.enqueue(12);
		System.out.println(customQueueWithFixedSize.getSize());
		System.out.println(customQueueWithFixedSize.isEmpty());
		System.out.println(customQueueWithFixedSize.isFull());
		System.out.println();
		customQueueWithFixedSize.show();
	}
	
	public void enqueue(int data) {
		if(!isFull()) {
		queue[rear]=data;
		rear=(rear+1)%5;
		size++;
		}else {
			System.out.println("Queue is Full");
		}
	}
	
	public int deQueue() {
		int data = queue[front];
		if(!isEmpty()) {
		front=(front+1)%5;
		size=size-1;
		}else {
			System.out.println("Queue is Empty");
		}
		return data;
	}
	
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.println(queue[(front+i)%5]+" ");
		}
	}
   public int getSize() {
	   return size;
   }
   public boolean isEmpty() {
	   return size==0;
   }
   public boolean isFull() {
	   return size==5;
   }
}
