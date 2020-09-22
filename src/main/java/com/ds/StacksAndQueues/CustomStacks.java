package com.ds.StacksAndQueues;

public class CustomStacks {
	int stack[]=new int[5];
	int top=0;

	public static void main(String[] args) {
		CustomStacks customStacks=new CustomStacks();
		customStacks.push(12);
		customStacks.push(14);
		customStacks.push(1);
		customStacks.push(21);
		customStacks.push(1);
		customStacks.push(4);
//		System.out.println("------");
//		System.out.println(customStacks.peek());
//		System.out.println("------");
//		customStacks.push(5);
//		System.out.println(customStacks.pop());
//		System.out.println("------");
		customStacks.show();
     
     
	}
	
	public void push(int data) {
		if(top==5) {
		 	System.out.println("stack is full");
		}else {
			stack[top]=data;
			top++;
		}
		
	}
	
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
		top--;
		data=stack[top];
		stack[top]=0;
		}
		return data;
	}
	public int peek() {
		int data;
		data=stack[top-1];
		return data;
	}
	
	public void show() {
		for(int n:stack) {
			System.out.println(n+" ");
		}
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	

}
