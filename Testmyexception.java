package com.firstpackage;

public class Testmyexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=1000;
		float z=(float)x/(float)y;
		try {
			if(z<0.01) {
				ArithmeticException eb= new ArithmeticException("number is very small even less than size of tau and mau  ");
				throw eb; // type her name of instance of exception class .
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
		finally {
			System.out.println("i am here");
		}
	}

}
