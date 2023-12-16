package com.tut.Java8.methodReference;

import java.util.ArrayList;
import java.util.List;

public class PracticalUseOfReference {
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
		 list.add(638);
		 list.add(628);
		 list.add(728);
		 list.add(88);
		 
		 // Using Lambda
		 list.stream().forEach(e -> {
			 System.out.println(e);
		 });
		 
		 // Using Method Reference
		 list.stream().forEach(System.out::println);
	}
}
