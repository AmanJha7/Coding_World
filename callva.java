package com.firstpackage;

import java.util.Scanner;

public class callva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int abc[]= {4,67,12,34,87,54,34,23,55,87,93,10,1,63,42,89,73};
		
		InsertionSort is=new InsertionSort(abc);
		System.out.println(is.sort());
	}

}
