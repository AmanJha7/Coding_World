package com.firstpackage;

import java.util.Scanner;

public class Interfacetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print5("enter value of two no ");
		float num1=sc.nextFloat();
		float num2=sc.nextFloat();
		Rectangle re=new Rectangle();
		Circle cr=new Circle();
		Area A;  //here we have only made reference variable but not object...
		A=re;
		System.out.println("area of rectangle = "+A.compute(num1,num2));
		A=cr;
		System.out.println("area of circle = "+A.compute(num1,num2));
	}

}
