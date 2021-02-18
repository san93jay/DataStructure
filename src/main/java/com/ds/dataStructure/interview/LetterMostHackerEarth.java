package com.ds.dataStructure.interview;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class LetterMostHackerEarth {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a;i++){
        	if(sc.hasNext()){
                String str1=sc.next(); 
                sb.append(str1);
             }
        }
        String str=sb.toString();
        Map<Character, Integer> map=new HashMap<Character, Integer>();

        for(int j=0;j<str.length();j++){
            if(map.containsKey(str.charAt(j))){
                map.put(str.charAt(j),map.get(str.charAt(j))+1);
            }else{
                map.put(str.charAt(j),1);
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for(Map.Entry m:map.entrySet()){
       list.add((Integer) m.getValue());
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));

    }
}