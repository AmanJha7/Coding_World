package com.firstpackage;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(1,"mango");
		map.put(2,"guvwa");
		map.put(3,"pineapple");
		map.put(4,"banana");
		map.put(5,"apple");
		System.out.println("Iterating Hashmap");
		for(Entry<Integer, String> m :map.entrySet() ) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println(map.entrySet()+" \n"+map);
		Set<Entry<Integer, String>> var=map.entrySet();
		System.out.println(var);
		int no= map.size();
		System.out.println(no);
		// we have learned that entrySet method returns an Set<Entry<Integer,String>>
		//where as each unit of entrySet method returns an Entry<Integer,String>
		//we have learned so many new concpets in Hashmap which is new from dictionary in python
		// ________python_______		
	}
}