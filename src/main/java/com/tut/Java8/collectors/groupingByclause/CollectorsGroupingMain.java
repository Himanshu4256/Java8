package com.tut.Java8.collectors.groupingByclause;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingMain {
	
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Naveen", "Noida", 30));
		personList.add(new Person("Prateek", "Delhi", 26));
		personList.add(new Person("Naman", "Hapur", 30));
		personList.add(new Person("VIbhu", "Rajkot", 26));
		personList.add(new Person("Pankaj", "Noida", 30));
		personList.add(new Person("VIbhu", "Rajkot", 25));
		
		Map<String, List<Person>> groupByCity = personList.stream().collect(Collectors.groupingBy(Person::getCity));
		groupByCity.forEach((city,person) -> {
			System.out.println(city);
			System.out.println(person);
		});
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Map<Integer, List<Person>> groupByAge = personList.stream().collect(Collectors.groupingBy(Person::getAge));
		groupByAge.forEach((age,person) -> {
			System.out.println(age);
			System.out.println(person);
		});
	}
}
