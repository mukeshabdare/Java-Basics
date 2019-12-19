package com.practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Coolections {

	public static void main(String[] args) {

		List<String> l1  = new ArrayList<>();
		List<String> l2  = new LinkedList<>();
		List<String> l3  = new Stack<>();
		List<String> l4  = new Vector<>();
		l1.add("a");
		l1.add("b");
		l1.add("e");
		Set<Integer> s1 = new HashSet<Integer>();
		for(int i=-10; i<0; i++) {
			s1.add(i);
		}
		System.out.println("Set");
		for(Integer i : s1) {
			System.out.println(i);
		}
		System.out.println(s1.size());
		System.out.println(s1.stream().filter(i->i%2==0).collect(Collectors.toList()));
		Set s2 = new LinkedHashSet<>();
		Set s3 = new TreeSet<>();
		
		Queue<String> q1 = new ArrayDeque<>();
		q1.addAll(l1);
		System.out.println(q1.containsAll(l1));
		
	}

}
