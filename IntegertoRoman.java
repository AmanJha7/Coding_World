package com.firstpackage;

import java.util.Scanner;

public class IntegertoRoman {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number...");
		int numb=sc.nextInt();
		while(numb>0)
		{
			if(numb>=1000) 
			{
				numb-=1000;
				sb.append("M");
			}
			else if (numb>=900) {
				numb-=900;
				sb.append("CM");
			}
			else if(numb>=500) {
				numb-=500;
				sb.append("D");
			}
			else if(numb>=400) {
				numb-=400;
				sb.append("CD");
			}
			else if(numb>=100) {
				numb-=100;
				sb.append("C");
			}
			else if(numb>=90) {
				numb-=90;
				sb.append("LC");
			}
			else if(numb>=50) {
				numb-=50;
				sb.append("L");
			}
			else if(numb>=40) {
				numb-=40;
				sb.append("XL");
			}
			else if(numb>=10) {
				numb-=10;
				sb.append("X");
			}
			else if(numb>=9) {
				numb-=9;
				sb.append("IX");
			}
			else if(numb>=5) {
				numb-=5;
				sb.append("V");
			}
			else if(numb>=4) {
				numb-=4;
				sb.append("IV");
			}
			else if(numb>=1) {
				numb-=1;
				sb.append("I");
			}
			
		}
		System.out.println(sb.toString());
	}

}
