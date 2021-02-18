package com.ds.dataStructure.interview;

import java.util.*;

public class SubArrayNegativeSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your    
        class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            if(sc.hasNext()){
              arr[i]=sc.nextInt();
            }
        }
        int count=0,sum=0;;
        List<List<Integer>> aslist=new ArrayList<List<Integer>>();
        for(int j=0;j<arr.length;j++){
            sum=0;
            List<Integer> list=new ArrayList<>();
            for(int k=j;k<arr.length;k++){
                sum=sum+arr[k];
                list.add(arr[k]);
                if(sum<0){
                    count=count+1;
                }
            }
            aslist.add(list);
        }
        System.out.println("----");
        for(int m=0;m<aslist.size();m++) {
        	System.out.println(aslist.get(m));
        }
        System.out.println("----");
        System.out.println(count);
    }
}
