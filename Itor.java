package com.firstpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Itor {

	
	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Delhi");
		cityNames.add("mumbai");
		cityNames.add("kolkata");
		cityNames.add("chandigarh");
		cityNames.add("noida");
		Iterator<String> itr=cityNames.iterator();
		System.out.println("city names elements");
		while(itr.hasNext()) {
			
			System.out.println(itr.next()+" ");
			
		}
		System.out.println();
	}
}

