package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableIMPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list  = new ArrayList<Student>();
		list.addAll(Arrays.asList(new Student(4,"A"), new Student(2,"b"),
				new Student(1,"A")));
		
//		Collections.sort(list, () -> Student::id-);
		
		

	}

}
