package com.ds.dataStructure.sortings;

public class SelectionSort {

	public static void main(String[] args)
	{
		int arr[]= {20,35,-15,7,55,1,-22};
		for(int i=0;i<arr.length-1;i++) {
			int max=i;
			for(int j=i+1;j<arr.length;j++)
			{
				/*
				 * if(arr[j]<arr[max]) { max=j; }
				 */
				if(arr[j]<arr[max])
				{
					max=j;
				}
			}
			int temp=arr[max];
			arr[max]=arr[i];
			arr[i]=temp;	
			
		}
		for(int i=0;i<arr.length;i++)
			{
			 System.out.print(arr[i]+" ");
			}
			
		
		
		
		
		
		

	}

}
