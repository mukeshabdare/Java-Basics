package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Employee> list = Arrays.asList(new Employee(1,"A"),
				new Employee(2,"B"), new Employee(3,"C"),
				new Employee(4,"A"), new Employee(5,"A"));
		
	list.stream().filter(e -> e.getEmpId()>2).collect(Collectors.groupingBy(Employee::getName));
		
	}

}
