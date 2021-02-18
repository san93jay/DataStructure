package com.ds.dataStructure.interview;

//Complete this code or write your own from scratch
import java.util.*;
import java.util.regex.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
      Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.next();
			int phone=in.nextInt();
			in.nextLine();
          String finalName=name.toLowerCase();
          if(isValid(String.valueOf(phone))) {
        	  map.put(finalName,phone);
          }
		}
		System.out.println(map);
		while(in.hasNext())
		{
			String s=in.nextLine();
          String finalName=s.toLowerCase();
          
              if(map.containsKey(finalName)){
                 int numbers=map.get(finalName);
                 System.out.println(finalName+"="+numbers);
              }else{
                  System.out.println("Not found");
              }
          
		}
	}

	private static boolean isValid(String number) {
		
	    Pattern p = Pattern.compile("^([0-9]|[1-9][0-9])$"); 
	    Matcher m = p.matcher(number); 
	    return (m.find() && m.group().equals(number));
		
	}
}