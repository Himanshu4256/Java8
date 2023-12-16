package com.tut.Java8.constructorReference;

public class ConstructorReference {
	public static void main(String[] args) {
		System.out.println("Constructor Reference");
		
//		Provider provider = () -> {
//			return new Student(); // bcz provide ka return type Student hai.
//		};	
//		Student student = provider.getStudent();
//		student.display();
		
		
//		Student::new is a constructor reference. It refers to the constructor of the Student class. and create instance also
		Provider provider = Student::new;
		Student student = provider.getStudent();
		student.display();
		
	}
}
