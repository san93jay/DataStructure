package com.ds.dataStructure.sortings;

public class BubbleSorting {

	public static void main(String[] args) {
		int arr[]= {20,35,-15,7,55,1,-22};
		System.out.println("Bubble sort for un-sorted array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					    arr[i]=arr[j];
					    arr[j]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int arr1[]= {20,35,-15,7,55,1,-22};
		System.out.println("Bubble sort for un-sorted array Second ways Udemy also");
		for(int pass=arr1.length-1;pass>=0;pass--)
		{
		    for(int i=0;i<pass;i++)// or for(int i=0;i<=pass-1;i++)
		    {
		    	if(arr1[i]>arr1[i+1])
		    	{
		    		int newTemp=arr1[i];
		    		arr1[i]=arr1[i+1];
		    		arr1[i+1]=newTemp;
		    	}
		    }
		}
	    System.out.println("After sorting Second");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
}
