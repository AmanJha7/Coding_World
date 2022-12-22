package com.firstpackage;

import java.util.Scanner;

interface Shae
{
	float ree(float a);
}

public class Lambdafun 
{
	public static void main(String[] args) {
		Shae ref=(float a) -> a*a;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("square is ->"+""+ref.ree(n));
		Shae cub=(float a)-> a*a*a;
		int b=sc.nextInt();
		System.out.println("cube is -> "+""+cub.ree(b));
	}
	//lamda means that us object ke pass interface ke method ka 
	//implementation hai..

	
}