package com.ds.dataStructure.interview;

import java.util.*;
public class test {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Deque deque = new ArrayDeque<>();
        List<Integer> deque=new ArrayList<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
           
        }
        finalresult(deque,n,m);

    }
	private static void finalresult(List<Integer> deque,int arraySize, int subArraySize){
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<=arraySize-subArraySize;i++){
            List<Integer> temp=new ArrayList<Integer>();
            for(int j=i;j<subArraySize+i;j++){
                temp.add(deque.get(j));
            }
            list.add(temp);
        }
        for(int j=0;j<list.size();j++) {
        	System.out.println(list.get(j));
        }
    }
}




