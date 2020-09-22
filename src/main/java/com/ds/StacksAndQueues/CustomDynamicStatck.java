package com.ds.StacksAndQueues;

import java.util.Arrays;

public class CustomDynamicStatck {
	int capacity=2;
	int stack[]=new int[capacity];
	int top=0;
	public static void main(String[] args) {
		CustomDynamicStatck customDynamicStatck=new CustomDynamicStatck();
		customDynamicStatck.push(12);
		customDynamicStatck.push(2);
		customDynamicStatck.push(4);
		customDynamicStatck.push(7);
		customDynamicStatck.push(3);
		customDynamicStatck.push(9);
		customDynamicStatck.show();
	}
	public void push(int data) {
	       if(size()==capacity) {
	    	  expand(); 
	       }else {
			stack[top]=data;
			top++;
	       }
	}
	
	private void expand() {
		int length=size();
		int newStack[]=new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
		capacity *=2;
		
	}
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
		top--;
		data=stack[top];
		stack[top]=0;
		shrink();
		}
		return data;
	}
	private void shrink() {
	int length=size();
	if(length<=(capacity/2)/2) {
		capacity=capacity/2;
		int newStatck[]=new int[capacity];
		System.arraycopy(stack, 0, newStatck, 0, length);
		stack=newStatck;
	}
		
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
