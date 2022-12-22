package com.firstpackage;

import java.util.Iterator;
//import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlistcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for (int i=1;i<=5;i++) {
			ll.add(i);
		}
		ll.remove(3);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+"  ");
		}
		System.out.println("_____________");
		Iterator<Integer> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
		System.out.println("");
		Object n=ll.clone();
		System.out.println(n);
		ll.addAll(3, ll);
		System.out.println(ll);
		System.out.println(ll.contains(n));
	}

}
