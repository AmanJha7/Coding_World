package com.firstpackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetCollection {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("pull ");
		hs.add("the ");
		hs.add("Basket ");
		hs.add("out ");
		hs.add("of ");
		hs.add("garden ");
		Iterator<String> itr =hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
