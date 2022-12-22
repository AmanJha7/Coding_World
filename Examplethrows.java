package com.firstpackage;

public class Examplethrows {
	static void divide_m() throws Exception  //it throw an exception from the function where it has been called
	{
		int x=22,y=0;
		int z=x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide_m();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("caught arthimetic exeption "+e);
		}
			
	}// i have noticed the different behaviour of throws w.r.t throw or general error since these two 
	//throw error at same time of  flow control whereas throw function give error at the function 
	//where it is called...

}
