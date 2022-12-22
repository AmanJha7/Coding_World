package com.firstpackage;

import java.util.Scanner;

public class Egnestedtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			int a=2,b=4,c=2,x=7,z;
			int p[]= {2,9,8,9};
			p[3]=33;
			try {
				z=x/((b*b)-(4*a*c));
				System.out.println("the value of z is "+z);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("division by zero ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("array index error ");
		}
	}

}
