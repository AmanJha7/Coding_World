package com.firstpackage;

import java.util.LinkedList;

public class InsertionSort {
	int array[];
	public InsertionSort(int arr[]){
		array=arr;
	}
	LinkedList<Integer> ll =new LinkedList<Integer>();
	
	
	
	@SuppressWarnings("unused")
	public LinkedList<Integer> sort()
	{
		@SuppressWarnings("unused")
		int lgth=array.length;
		for(int i=1;i<lgth;i++) {
			int temp=array[i];
			int j=i-1;
			while(j>=0 && array[j]>temp)
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=temp;
		}
		for(int j=0;j<array.length;j++)
		{
			ll.add(array[j]);
			
		}
		return ll;
	}
	
}
