package com.firstpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class JavaDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, LinkedList<Integer>> hm=new HashMap<Integer,LinkedList<Integer>>();
		LinkedList<Integer> ob= new LinkedList<Integer>();
		ob.add(89);
		ob.add(78);
		ob.add(56);
		ob.add(93);
		ob.add(67);
		LinkedList<Integer> ob2= new LinkedList<Integer>();
		ob2.add(93);
		ob2.add(78);
		ob2.add(98);
		ob2.add(78);
		ob2.add(87);
		hm.put(1,ob);
		hm.put(2,ob2);
		System.out.println(hm);
		for(Entry<Integer, LinkedList<Integer>> m : hm.entrySet())
		{
			System.out.println(m.getKey()+" -->  "+m.getValue());
			Iterator<Integer> itr=m.getValue().iterator();
			System.out.println("-----------------");
			while(itr.hasNext()) {
				System.out.print(itr.next()+"  ");
			}
			System.out.println("");
		}
		
	}

}
