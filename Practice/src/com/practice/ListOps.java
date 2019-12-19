package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOps {

	public static void main(String[] args) {

//		ArrayList<Integer> ar = new ArrayList<Integer>();
//		for(int i=1; i<20; i++) {
//			ar.add(i);
//		}
//
//		ar.removeIf(n -> (n%2==0));
//		
//		Iterator it = ar.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+" ");
//		}
//		System.out.println();
		ListOps l = new ListOps();
		l.method(null);
	}
	
	void method(String s) {
		System.out.println("String");
		return;
	}
	
	void method(Object o) {
		System.out.println("Object");
		return;
	}

}
