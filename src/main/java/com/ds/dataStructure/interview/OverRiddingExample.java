package com.ds.dataStructure.interview;

public class OverRiddingExample {

	public static void main(String[] args) {
		A b=new B();
		printV(b);

	}

	private static void printV(A b) {
		if(b instanceof B) {
			b.printValue();
		}else if(b instanceof A) {
			b.printValue();
		}
		
	}

}
