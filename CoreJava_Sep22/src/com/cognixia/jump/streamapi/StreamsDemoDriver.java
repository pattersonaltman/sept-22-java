package com.cognixia.jump.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsDemoDriver {

	
	
	
	
	public static void main(String[] args) {


		
		int[] primitives = {1,2,3,4,5,6,7,8,9};
		Integer[] integers = new Integer[primitives.length];
		for(int i = 0; i < primitives.length; i++)
		{
			integers[i] = primitives[i];
		}
		
		
		
		Integer[] intObjs = Arrays.stream(primitives)
				.boxed()
				.toArray(Integer[]::new);
		
		
		System.out.println(Arrays.toString(primitives));
		System.out.println(Arrays.toString(integers));
		System.out.println(Arrays.toString(intObjs));
		
		List<Integer> numbers = Arrays.asList(integers);
		
		System.out.println("\nFor Each example:");
		numbers.forEach(System.out::println);
		numbers.forEach(n -> System.out.println(n + " custom message (with lambdas)!"));
		
		
		//use reduce to get the sum
		int sum = numbers.stream()
				.reduce(0,  (num1, num2) -> num1 + num2);
		
		System.out.println(sum);
		
		
		
		
		//use reduce for logical, binary choices, get max values
		int max = numbers.stream()
				.reduce((num1, num2) -> num1 > num2 ? num1 : num2)
				.get();
		
		System.out.println(max);
		
		
		
		
		
		//Let's stream some custom objects
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Patterson", 110_000, "Production"));
		employees.add(new Employee("Mandeep", 200_000, "Director"));
		employees.add(new Employee("Xavier", 150_000, "Script Writing"));
		employees.add(new Employee("Matthew", 0, "IT"));
		employees.add(new Employee("Arun", Integer.MAX_VALUE, "Secret"));
		
		//return the employee with the lowest salary
		Employee lowest = employees.stream()
				.reduce((e1,  e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2)
				.get();
		
		System.out.println("Employee with the lowest salary " + lowest);

		
		
		//find the max?
		String searchValue = "mandeep";
		Optional<Employee> search = employees.stream()
				.filter(e -> e.getName().equalsIgnoreCase(searchValue))
				.findFirst();
				
		if(search.isPresent())
		{
			System.out.println(search.get());
		}
		else
		{
			System.out.println(searchValue + " not found");
		}
		
		
		
				
				
		//.map() applies a custom function to all entries in the stream
		// get the list of salaires, after doubling them
		List<Integer> employeesAfterRaise = employees.stream()
				.map(e -> e.getSalary() *2 ) // at this point we are not working with a Stream of Integers
				.collect(Collectors.toList());
		
		employees.forEach(e -> e.setSalary(e.getSalary()*2));
		
		System.out.println(employees);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
