package com.tut.Java8.methodReference;

public class MethodReference {
	public static void main(String[] args) {
		System.err.println("Learning Method Reference");
		
		//Provide the Implementation of WorkInter this is simple way and we provide "MANNULY BODY OF ABSTRACT METHOD" 
		WorkInter workInter = () -> {
			System.out.println("this is do task new Method");
		};
		workInter.doTask();
		
		
		// But aab Hme Kisi Dusre Method ki body absract Method mai deni hai
		// To Hme Method Reference ka use krna padega which is [::]
		
//		1) Static Method Refer
		WorkInter workInter2 = Stuff::doStuff;
		//yaha WorkInter ke doTask() Method mai Stuff class k doStuff method ki body aayi hai.
		workInter2.doTask();
		
		
		Runnable runnable = Stuff::threadTask;
		Thread thread = new Thread(runnable);
		thread.start();
		
//		2) Non Static Method
		Stuff stuff = new Stuff();
		Runnable runnable2 = stuff::printNumbers;
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		
//		3) Argument Method -> if you want to give the body of Argument Method then Must You have to put same argument Return type can be change.
		WorkInter inter = Stuff::doStuff;
		
	}
}
