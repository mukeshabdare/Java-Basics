package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {

	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this!=obj) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		Student s = (Student) obj;
		if(this.id != s.id) {
			return false;
		}
		return true;
		
	}

	@Override
	public int hashCode() {
		final int prime = 13;
		return this.id*prime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student(1,"Mukesh");
		Student s2= new Student(2,"Abdare");
		
		Map<Student, String> myMap = new HashMap<>();
		myMap.put(s1, "Mukesh");
		myMap.put(s2, "Abdare");
		myMap.put(s2, "Unknown");
		Iterator<Student> it = myMap.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(myMap.get(it.next()));
		}
		
	}

}
