package com.tut.Java8.OptionalClass;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String str = "This is Java 8 Feature";
		Optional<String>  optional = Optional.ofNullable(str); //  True/False
		System.out.println(optional.isPresent());
		
		//Retrieve value of optional
		System.out.println(optional.get());
		
		//if value is present then return value otherwise return message
		System.out.println(optional.orElse("str is empty"));
		
		System.out.println(optional.hashCode());
	}
}
