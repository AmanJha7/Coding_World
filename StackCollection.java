package com.firstpackage;

import java.util.Iterator;
import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st+"\n");
		Iterator<Integer> itr=st.iterator();
		System.out.println(itr);
		while (itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
		System.out.println("\n");
		System.out.println(st.pop()+" <-- stack popped element...");
		System.out.println(st);
	}

}
